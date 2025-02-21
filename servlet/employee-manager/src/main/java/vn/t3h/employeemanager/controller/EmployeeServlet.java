package vn.t3h.employeemanager.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.employeemanager.dao.EmployeeDao;
import vn.t3h.employeemanager.dao.impl.EmployeeDaoMysqlImpl;
import vn.t3h.employeemanager.model.Employee;
import vn.t3h.employeemanager.service.EmployeeService;
import vn.t3h.employeemanager.service.impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet",value = "/cms/employee")
public class EmployeeServlet extends HttpServlet {

    private EmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        super.init();
        // init bean, apply DI design pattern
        EmployeeDao employeeDao = new EmployeeDaoMysqlImpl();
        employeeService = new EmployeeServiceImpl(employeeDao);
    }

    /*
    Chuyên tiếp nhận các request từ client, và trả về response
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // get param from request
        String name = req.getParameter("name");
        String salary = req.getParameter("salary");
        String fromDate = req.getParameter("fromDate");
        String toDate = req.getParameter("toDate");
        String position = req.getParameter("position");
        List<Employee> employees = employeeService.findByFilter(name,salary,fromDate,toDate,position);
        req.setAttribute("employeeData",employees);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/cms/employees.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
