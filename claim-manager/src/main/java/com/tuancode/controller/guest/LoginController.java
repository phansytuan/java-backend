package com.tuancode.controller.guest;

import com.tuancode.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @Autowired
  private LoginService loginService;

  @GetMapping("/login")
  public String login() {
    return "guest/login";
  }

  @GetMapping("/process-after-login-success")
  public String processAfterLoginSuccess() {
    return loginService.processAfterLoginSuccess();
  }
}
