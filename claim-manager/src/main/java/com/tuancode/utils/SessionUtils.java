package com.tuancode.utils;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SessionUtils {
  public static UserDetails getUserPrincipal() {
    // lấy ra thông tin user hiện tại đang thực hiện request vừa login xong
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication == null || !authentication.isAuthenticated()) {
      throw new AuthenticationServiceException("Authentication required");
    }
    // thông tin user hiện tại
    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
    System.out.println(String.format("User %s logged in", userDetails.getUsername()));
    return userDetails;
  }
}
