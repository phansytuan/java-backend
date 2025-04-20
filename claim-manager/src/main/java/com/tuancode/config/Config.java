//package com.tuancode.config;
//
//import com.tuancode.security.interceptor.UserInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class Config implements WebMvcConfigurer {
//
//  @Autowired
//  private UserInterceptor userInterceptor;
//
//  @Autowired
//  public void addInterceptors(InterceptorRegistry registry) {
//    registry.addInterceptor(userInterceptor).addPathPatterns("/**");
//  }
//}
