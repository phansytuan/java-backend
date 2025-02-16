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
}
