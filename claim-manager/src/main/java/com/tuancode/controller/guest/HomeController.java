package com.tuancode.controller.guest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    /*
     cho phép truy cập ở cả 2 url:
        localhost:8080/
        localhost:8080/home
    */
    @GetMapping(value = {"/", "/home"})
    public String homePage() {
        return "guest/home-page";
    }
}

