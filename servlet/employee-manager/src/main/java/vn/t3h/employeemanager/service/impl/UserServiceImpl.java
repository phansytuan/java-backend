package vn.t3h.employeemanager.service.impl;

import jakarta.servlet.http.HttpServletRequest;
import vn.t3h.employeemanager.dao.RoleDao;
import vn.t3h.employeemanager.dao.UserDao;
import vn.t3h.employeemanager.model.RoleModel;
import vn.t3h.employeemanager.model.UserModel;
import vn.t3h.employeemanager.service.UserService;
import vn.t3h.employeemanager.utils.Constants;
import vn.t3h.employeemanager.utils.PasswordUtil;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private RoleDao roleDao;

    public UserServiceImpl(UserDao userDao,RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }

    @Override
    public String login(String username, String password, HttpServletRequest request) {
        String passwordEncrypted = PasswordUtil.encryptPassword(password);
        UserModel user = userDao.findUserByUserNameAndPassword(username,passwordEncrypted);
        String urlRedirect = "";
        if (user == null) {
            urlRedirect = "/login?message="+Constants.LOGIN_ERROR;
            return urlRedirect;
        }

        RoleModel roleModel = roleDao.findRoleById(user.getRoleId());
        if (roleModel == null) {
            urlRedirect = "/login?message="+Constants.PERMISSION_DENIED;
            return urlRedirect;
        }
        request.getSession().setAttribute(Constants.SESSION_ID_CURRENT_USER,user);
        if (roleModel.getCode().equals(Constants.ROLE.ROLE_ADMIN.name())){
            urlRedirect = "/cms/employee";
        }else {
            urlRedirect = "/home";
        }
        return urlRedirect;
    }
}