package vn.t3h.employeemanager.dao;

import vn.t3h.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployee();
}
