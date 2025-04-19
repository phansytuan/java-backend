package vn.t3h.btvn.bookshop.service;

import jakarta.servlet.http.HttpServletRequest;

public interface UserService {

    public String login(String username, String password, HttpServletRequest request);
}
