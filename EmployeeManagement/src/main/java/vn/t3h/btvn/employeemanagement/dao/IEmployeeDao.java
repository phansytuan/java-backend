package vn.t3h.btvn.employeemanagement.dao;

import vn.t3h.btvn.employeemanagement.model.Employee;
import java.util.List;

public interface IEmployeeDao {
    List<Employee> searchEmployees(
            String name,
            String salaryStr,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    );
    // Thêm nhân viên: trả về số dòng ảnh hưởng (nếu >0 thì thành công)
    int insertEmployee(Employee employee);

    // Lấy thông tin nhân viên theo ID
    Employee getEmployeeById(int employeeId);

    // Cập nhật thông tin nhân viên
    int updateEmployee(Employee employee);

    // Xoá nhân viên
    int deleteEmployee(int employeeId);
}
