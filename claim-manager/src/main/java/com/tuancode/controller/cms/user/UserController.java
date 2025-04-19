package com.tuancode.controller.cms.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cms")
public class UserController {

  @GetMapping("/user-manager")
  public String userManager() {
    return "cms/user/user-manager";
  }

  @GetMapping("/create-user")
  public String createUser() {
    return "cms/user/create-user";
  }

  @GetMapping("/detail-user/{id}")
  public String detailUser(@PathVariable Long id) {
    return "cms/user/detail-user";
  }
}