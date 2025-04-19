package com.tuancode.security;

import com.tuancode.entity.RoleEntity;
import com.tuancode.entity.UserEntity;
import com.tuancode.repository.RoleRepository;
import com.tuancode.repository.UserRepository;
import com.tuancode.utils.Constant;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserDetailServiceCustom implements UserDetailsService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  /*
  - đây sẽ là method được gọi đầu tiên khi user thực hiện click login trên UI login
  - String username -> chính là username mà user nhập trên UI login
      b1: phải thực hiện lấy ra user entity từ username
      b2: lấy ra danh sách quyền của user từ user entity
      b3: tạo ra user detail của thư viện spring security (org.springframework.security.core.userdetails)
          từ các thông tin của user entity như username, password, danh sách quyền
      b4: gửi user detail đã tạo ra từ b3. cho spring security
   */
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    if (StringUtils.isEmpty(username)) {
      throw new UsernameNotFoundException("username is empty");
    }

    // b1: phải thực hiện lấy ra user entity từ username
    UserEntity userEntity = userRepository.findByUsername(username);
    if (userEntity == null) {
      throw new UsernameNotFoundException("username not found");
    }

    // b2: lấy ra danh sách quyền của user từ user entity
//  Set<RoleEntity> roleEntities = userEntity.getRoles(); // FetchType.EAGER
    Set<RoleEntity> roleEntities = roleRepository.findByUsername(username); // FetchType.LAZY

    Set<GrantedAuthority> grantedAuthorities = new HashSet<>(); // danh sách quyền của spring security
    for (RoleEntity roleEntity : roleEntities) {
      grantedAuthorities.add(new SimpleGrantedAuthority(
          Constant.PREFIX_ROLE + roleEntity.getCode())); // ROLE_ADMIN || ROLE_USER
    }

    // b3: tạo ra user detail (UserDetails)
    UserDetails userDetails = new User(userEntity.getUsername(), userEntity.getPassword(),
        grantedAuthorities);

    // b4: gửi user detail đã tạo ra từ b3. cho spring security
    return userDetails;
  }
}
