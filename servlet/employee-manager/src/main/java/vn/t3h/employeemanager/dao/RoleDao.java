package vn.t3h.employeemanager.dao;
import vn.t3h.employeemanager.model.RoleModel;

public interface RoleDao {
    RoleModel findRoleById(Integer roleId);
}
