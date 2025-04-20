//package com.tuancode.security.interceptor;
//// bước trung gian để tất cả các request sẽ phải đi qua đây
//
//import com.tuancode.utils.SessionUtils;
//import jakarta.servlet.http.Cookie;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//@Component
//public class UserInterceptor implements HandlerInterceptor {
//
//  @Override
//  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//      throws Exception {
//    UserDetails currentUser = SessionUtils.getUserPrincipal();
//    if (currentUser == null) {
//      return true;
//    }
//    HttpSession session = request.getSession();
//    session.setAttribute("userName", currentUser.getUsername());
//
//    Cookie cookie = new Cookie("userName", currentUser.getUsername());
//    cookie.setPath("/");
//    cookie.setMaxAge(7*24*60*60);
//    response.addCookie(cookie);
//
//    return true;
//  }
//}
