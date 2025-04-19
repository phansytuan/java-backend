package vn.t3h.btvn.bookshop.service.impl;

import vn.t3h.employeemanager.dao.RoleDao;
import vn.t3h.employeemanager.model.RoleModel;
import vn.t3h.employeemanager.service.RoleService;

public class RoleServiceImpl implements RoleService {

    private RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public RoleModel getRoleById(Integer roleId) {
        return roleDao.findRoleById(roleId);
    }
}
