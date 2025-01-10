package vn.t3h.employeemanager.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.employeemanager.model.Employee;
import vn.t3h.employeemanager.service.EmployeeService;
import vn.t3h.employeemanager.service.EmployeeServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name="EmployeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmployeeService employeeService = new EmployeeServiceImpl();
        List<Employee> employees = employeeService.getAllEmployees();
        req.setAttribute("employeesData", employees);

        RequestDispatcher reqDispatcher = req.getRequestDispatcher("EmployeeList.jsp");
        reqDispatcher.forward(req, resp);
    }
}
