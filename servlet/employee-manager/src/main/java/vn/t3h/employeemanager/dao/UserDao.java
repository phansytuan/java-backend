package vn.t3h.employeemanager.dao;

import vn.t3h.employeemanager.model.UserModel;

public interface UserDao {
    UserModel findUserByUserNameAndPassword(String username, String password);
}
