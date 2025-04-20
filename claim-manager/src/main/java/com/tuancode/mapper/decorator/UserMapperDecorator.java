package com.tuancode.mapper.decorator;
// để xử lý thằng avatar

import com.tuancode.entity.RoleEntity;
import com.tuancode.entity.UserEntity;
import com.tuancode.mapper.UserMapper;
import com.tuancode.service.FileService;
import com.tuancode.service.dto.UserDTO;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public abstract class UserMapperDecorator implements UserMapper {

  // tiêm user mapper vào
  @Autowired
  @Qualifier("delegate")
  private UserMapper userMapper;

  // cần cả thằng File Service
  @Autowired
  private FileService fileService;

  @Override
  public UserDTO toUserDTO(UserEntity userEntity) {
    UserDTO userDTO = userMapper.toUserDTO(userEntity);

    String fileBase64 = fileService.getBase64FromPath(userEntity.getPathAvatar());
    if (StringUtils.hasText(fileBase64)) {
      userDTO.setStringBase64Avatar(userEntity.getMimeType() + fileBase64);
    }
    String roleName = userEntity.getRoles().stream().map(RoleEntity::getName).collect(Collectors.joining(","));
    userDTO.setRoleName(roleName);
    return userDTO;
  }
}
