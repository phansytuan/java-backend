package vn.t3h.employeemanager.service;

import vn.t3h.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();

    List<Employee> findByFilter(String name,String salary,String fromDate,String toDate,String position);
}

