package vn.t3h.employeemanager.dao;

import vn.t3h.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployee();

    List<Employee> findByCondition(String name, String salary, String fromDate, String toDate, String position);
}
