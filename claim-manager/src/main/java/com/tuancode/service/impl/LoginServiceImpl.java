package com.tuancode.service.impl;

import com.tuancode.service.LoginService;
import com.tuancode.utils.Constant;
import com.tuancode.utils.SessionUtils;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  public String processAfterLoginSuccess() {
    UserDetails userDetails = SessionUtils.getUserPrincipal();

    // lấy ra danh sách quyền của user
    List<String> roleCode = userDetails.getAuthorities().stream().map(
        GrantedAuthority::getAuthority).toList();
    System.out.println(String.format("Role Code: %s", roleCode));

    // kiểm tra xem có phải admin không
    boolean isAdmin = roleCode.contains(Constant.PREFIX_ROLE + Constant.ROLE_ADMIN_CODE);

    if(isAdmin) {
      return "/cms/dashboard";
    }
    return "/home"; // else ROLE_USER
  }
}
