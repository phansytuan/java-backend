package vn.t3h.btvn.employeemanagement.service;

import vn.t3h.btvn.employeemanagement.dao.EmployeeDao;
import vn.t3h.btvn.employeemanagement.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        // Tạo DAO, hoặc có thể inject qua constructor
        this.employeeDao = new EmployeeDao();
    }

    public List<Employee> searchEmployees(
            String name,
            String salary,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    ) {
        // Tại đây, bạn có thể validate các tham số trước khi gọi DAO
        // Ví dụ, cắt trim hoặc kiểm tra format, ...

        // Gọi hàm searchEmployees của DAO
        return employeeDao.searchEmployees(
                emptyToNull(name),
                emptyToNull(salary),
                emptyToNull(fromHireDate),
                emptyToNull(toHireDate),
                emptyToNull(position),
                emptyToNull(departmentId)
        );
    }

    // Hàm tiện ích để chuyển chuỗi rỗng thành null
    private String emptyToNull(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        return str.trim();
    }
}

