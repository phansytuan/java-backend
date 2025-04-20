package com.tuancode.security.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import com.tuancode.security.JwtService;
import com.tuancode.utils.Constant;
import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

  @Autowired
  private JwtService jwtService;

  private String[] urlIgnore = {"/process-login","/login","/home","/logout"};

  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
      FilterChain filterChain) throws ServletException, IOException {
    /*
      bỏ qua các url login, process_login, logout, home
      vì đây là các url không cần authen
     */
    boolean ignore = false;
    for (String url : urlIgnore) {
      if (request.getRequestURI().contains(url)) {
        ignore = true;
        break;
      }
    }
    if (ignore) {
      filterChain.doFilter(request, response);
      return;
    }

    // lấy ra token jwt từ cookie để kiểm tra
    String tokenJwt = null;
    Cookie[] cookies = request.getCookies();
    if (cookies==null) {
      response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
      return;
    }
    for (Cookie cookie : cookies) {
      if (Constant.JWT.JWT.name().equals(cookie.getName())) {
        tokenJwt = cookie.getValue();
        break;
      }
    }
    if (StringUtils.isEmpty(tokenJwt) || !jwtService.validateToken(tokenJwt)) {
      response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
    }
    // token hợp lệ -> cho qua đến tầng rest controller / controller
    filterChain.doFilter(request, response);
  }
}
