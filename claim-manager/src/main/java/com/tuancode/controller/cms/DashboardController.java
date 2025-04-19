package com.tuancode.controller.cms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // khai báo đây là 1 controller sẽ trả về view html
@RequestMapping("/cms") // Làm gốc url cho tất cả các method
public class DashboardController {

    @GetMapping("/dashboard")
    public String getDashboard() {
        return "cms/dashboard";
    }
}
