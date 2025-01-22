package vn.t3h.employeemanager.service;

import vn.t3h.employeemanager.dao.EmployeeDAO;
import vn.t3h.employeemanager.dao.impl.EmployeeDAOmysqlImpl;
import vn.t3h.employeemanager.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> getAllEmployees() {
//        EmployeeDAO employeeDAO =new EmployeeDAOimpl();
        return employeeDAO.getAllEmployee();
    }
}
// tiêm dependency injection thông qua constructor