package com.tuancode.service.impl;

import com.tuancode.entity.RoleEntity;
import com.tuancode.entity.UserEntity;
import com.tuancode.mapper.UserMapper;
import com.tuancode.repository.RoleRepository;
import com.tuancode.repository.UserRepository;
import com.tuancode.service.FileService;
import com.tuancode.service.UserService;
import com.tuancode.service.dto.UserDTO;
import com.tuancode.service.dto.response.Response;
import com.tuancode.service.dto.response.ResponsePage;
import com.tuancode.utils.Constant;
import com.tuancode.utils.SessionUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {

  @Value("${application.root.folder}")
  private String rootFolderUpload;

  @Value("${application.root.folder.image}")
  private String rootFolderImageUpload;

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private FileService fileService;

  /*
   * 1.	convert dữ liệu field stringBase64Avatar từ StringBase64 trong userDto về lại file image
   * 2.	lưu file image vào folder của ổ cứng local tại path D:\T3H_Java\(springboot)
   * file-upload\image 3.	Lưu lại đường dẫn của ảnh 4.	Convert toàn bộ dữ liệu dạng userDto sang
   * dạng UserEntity để lưu vào database • lưu ý: set đường dẫn đã lưu vảnh vào thuộc tính
   * pathAvatar của object UserEntity mặc định luôn gán quyền Role Admin cho user 5.	Sau khi đã hoàn
   * chỉnh thông tin UserEntity -> lưu UserEntity vào database 6.	Trả về toàn UserDto để thông báo
   * cho font-end đã tạo user thành công
   */

  @Override
  public Response<UserDTO> saveUser(UserDTO userDTO) {
    //   3.	Lưu lại đường dẫn của ảnh
    String pathFileAvatar = saveImageAvatar(userDTO);

    //   4.	Convert toàn bộ dữ liệu dạng userDto sang dạng UserEntity để lưu vào database (ta dùng mapstruct)
    UserEntity userEntity = userMapper.toUserEntity(userDTO);
    userEntity.setCode(Constant.CODE_START + UUID.randomUUID());
    userEntity.setCreatedDate(LocalDateTime.now());
    userEntity.setLastModifiedDate(LocalDateTime.now());
    userEntity.setPathAvatar(pathFileAvatar);
    userEntity.setMimeType(userDTO.getMimeType());
    // set role
    setRole(userEntity);
    // save vào db
    UserEntity savedUserEntity = userRepository.save(userEntity);
    // convert về dạng userDTO
    userDTO = userMapper.toUserDTO(savedUserEntity);
    Response<UserDTO> response = new Response<UserDTO>();
    response.setCode(HttpStatus.OK.value());
    response.setMessage(HttpStatus.OK.name());
    response.setData(userDTO);

    return response;
  }

  @Override
  public ResponsePage<List<UserDTO>> getAllUser(String code,
                                                LocalDate fromDate,
                                                LocalDate toDate,
                                                String phone,
                                                Pageable pageable) {
    if (StringUtils.isEmpty(code)) {
      code = null;
    }
    if (StringUtils.isEmpty(phone)) {
      phone = null;
    }
    // query entity
    Page<UserEntity> pageUserEntities = userRepository.search(code, fromDate, toDate, phone, pageable);
    // convert entity -> dto
    List<UserDTO> userDTOs = userMapper.toDTO(pageUserEntities.getContent());
    ResponsePage<List<UserDTO>> responsePage = new ResponsePage<>();
    responsePage.setPageIndex(pageable.getPageNumber());
    responsePage.setPageSize(pageable.getPageSize());
    responsePage.setTotalElement(pageUserEntities.getTotalElements());
    responsePage.setCode(HttpStatus.OK.value());
    responsePage.setData(userDTOs);
    responsePage.setMessage(HttpStatus.OK.name());
    responsePage.setTotalPage(pageUserEntities.getTotalPages());

    return responsePage;
  }

  @Override
  public Response<UserDTO> getDetailUser(Long id) {

    UserEntity userEntity = userRepository.findById(id)
        .orElse(null); // nếu không tồn tại user với id này nó sẽ trả ra null
    if (userEntity == null) {
      Response<UserDTO> response = new Response<>(HttpStatus.BAD_REQUEST.value(), "user not exists", null);
      return response;
    }

    UserDTO userDTO = userMapper.toUserDTO(userEntity); // convert
  /*
    String fileBase64 = fileService.getBase64FromPath(userEntity.getPathAvatar());

    if (StringUtils.hasText(fileBase64)) {
      userDTO.setStringBase64Avatar(userEntity.getMimeType() + fileBase64);
    }
  */
    Response<UserDTO> response = new Response<>(HttpStatus.OK.value(), HttpStatus.OK.name(), userDTO);

    return response;
  }

  @Override
  public Response<UserDTO> getCurrentUser() {
    // get current logged in user
    UserDetails userDetails = SessionUtils.getUserPrincipal();
    System.out.println(String.format("current user login: %s", userDetails.getUsername()));

    // tiếp tục lấy ra user details từ username
    UserEntity userEntity = userRepository.findByUsername(userDetails.getUsername());
    UserDTO userDTO = userMapper.toUserDTO(userEntity);
    Response<UserDTO> response = new Response<>(HttpStatus.OK.value(), "Success", userDTO);
    return response;
  }

  private void setRole(UserEntity userEntity) {
    // (tiêm lại role)
    RoleEntity roleEntity = roleRepository.findByCodeAndDeletedIsFalse(Constant.ROLE_ADMIN_CODE);
    Set<RoleEntity> roleEntities = new HashSet<>();
    roleEntities.add(roleEntity);
    userEntity.setRoles(roleEntities);
  }

  //    1.	convert dữ liệu filed stringBase64Avatar từ StringBase64 trong userDto về lại file image
  public String saveImageAvatar(UserDTO userDTO) {

    if (StringUtils.isEmpty(userDTO.getStringBase64Avatar())) {
      return "";
    }
    String[] partsBase64 = userDTO.getStringBase64Avatar().split(",");
    // get mime type image
    String mimeType = partsBase64[0];
    // lấy phần dữ liệu image base64
    String dataImage = partsBase64[1];
    byte[] decodedByte = Base64.getDecoder().decode(dataImage);

    // xác định đuôi của file
    String fileExtension = "";
    if (mimeType.contains("image/jpeg")) {
      fileExtension = ".jpg";
    } else if (mimeType.contains("image/png")) {
      fileExtension = ".png";
    }
    userDTO.setMimeType(mimeType + ",");

    //      2.	lưu file image vào folder của ổ cứng local tại path D:\\T3H_Java\\(springboot) file-upload\\image
    // String rootFolderImage = "D:\\T3H_Java\\(springboot) file-upload\\image\\";
    String rootFolderImage = rootFolderUpload + rootFolderImageUpload;
    String fileName = "avatar_" + userDTO.getUsername() + fileExtension;
    String finalPathAvatar = rootFolderImage + fileName;

    // Kiểm tra xem có thư mục đó chưa
    File rootFolderData = new File(rootFolderImage);
    if (!rootFolderData.exists()) { // nếu chưa có -> tạo folder
      rootFolderData.mkdir();
    }

    // lưu file
    try (FileOutputStream fos = new FileOutputStream(new File(finalPathAvatar))) {
      fos.write(decodedByte);
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    } finally {
      System.out.println("Save file success " + finalPathAvatar);
    }
    return finalPathAvatar;
  }
}
