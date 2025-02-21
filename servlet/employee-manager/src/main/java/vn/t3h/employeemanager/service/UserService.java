package vn.t3h.employeemanager.service;

import jakarta.servlet.http.HttpServletRequest;

public interface UserService {

    public String login(String username, String password, HttpServletRequest request);
}
