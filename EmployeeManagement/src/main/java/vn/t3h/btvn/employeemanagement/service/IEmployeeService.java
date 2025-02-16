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
}
