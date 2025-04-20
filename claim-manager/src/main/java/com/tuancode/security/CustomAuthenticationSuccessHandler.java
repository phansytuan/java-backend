package com.tuancode.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import com.tuancode.service.LoginService;
import com.tuancode.utils.Constant;
import java.io.IOException;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

  @Autowired
  private JwtService jwtService;

  @Autowired
  private LoginService loginService;

  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
      FilterChain chain, Authentication authentication) throws IOException, ServletException {
    AuthenticationSuccessHandler.super.onAuthenticationSuccess(request, response, chain,
        authentication);
  }

  /*
    - handle logic sau khi login thành công
      + tạo ra token jwt
      + ghi token vào cookie
      + điều hướng về page, theo role
  */
  @Override
  public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
      Authentication authentication) throws IOException, ServletException {
    // tạo token
    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
    String jwt = jwtService.generateToken(userDetails);

    // taọ ra cookie, thêm token vào cookie
    Cookie jwtCookie = new Cookie(Constant.JWT.JWT.name(), jwt);
    jwtCookie.setPath("/");
    jwtCookie.setHttpOnly(true); // chỉ cho phép http (trình duyệt) truy cập, không cho phép js của trình duyệt truy cập vào và sử dụng
    jwtCookie.setSecure(true); // sử dụng https
//    jwtCookie.setDomain("http://localhost:8080/*"); // chỉ cho phép domain được config sử dụng
    jwtCookie.setMaxAge(24*60*60); // 1 ngày

    // set cookie cho response
    response.addCookie(jwtCookie);

    // lấy ra url để điều hướng tới url theo role
    String urlRedirect = loginService.processAfterLoginSuccess();
    response.sendRedirect(urlRedirect);
  }
}
