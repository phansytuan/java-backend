package vn.t3h.btvn.employeemanagement.service;

import vn.t3h.btvn.employeemanagement.model.Employee;
import java.util.List;

public interface IEmployeeService {
    List<Employee> searchEmployees(
            String name,
            String salary,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    );
    // Thêm nhân viên
    boolean addEmployee(Employee employee);

    // Lấy thông tin nhân viên theo ID (cho chức năng chỉnh sửa)
    Employee getEmployeeById(int employeeId);

    // Cập nhật thông tin nhân viên
    boolean updateEmployee(Employee employee);

    // Xoá nhân viên
    boolean deleteEmployee(int employeeId);
}
