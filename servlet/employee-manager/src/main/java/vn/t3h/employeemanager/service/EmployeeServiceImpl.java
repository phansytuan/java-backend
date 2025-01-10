package vn.t3h.employeemanager.service;

import vn.t3h.employeemanager.dao.EmployeeDAO;
import vn.t3h.employeemanager.dao.impl.EmployeeDAOimpl;
import vn.t3h.employeemanager.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        EmployeeDAO employeeDAO =new EmployeeDAOimpl();
        return employeeDAO.getAllEmployee();
    }
}
