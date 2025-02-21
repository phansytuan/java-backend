package vn.t3h.btvn.employeemanagement.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.btvn.employeemanagement.dao.impl.EmployeeDaoMysqlImpl;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.service.IEmployeeService;
import vn.t3h.btvn.employeemanagement.service.impl.EmployeeServiceImpl;
import java.io.IOException;

@WebServlet("/employee-edit")
public class EditEmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.employeeService = new EmployeeServiceImpl(new EmployeeDaoMysqlImpl());
    }

    // Hiển thị form chỉnh sửa với dữ liệu đã có của nhân viên
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeIdStr = req.getParameter("employeeId");
        if(employeeIdStr != null){
            int employeeId = Integer.parseInt(employeeIdStr);
            Employee employee = employeeService.getEmployeeById(employeeId);
            req.setAttribute("employee", employee);
            RequestDispatcher dispatcher = req.getRequestDispatcher("edit-employee.jsp");
            dispatcher.forward(req, resp);
        } else {
            resp.sendRedirect(req.getContextPath() + "/employee");
        }
    }

    // Xử lý cập nhật dữ liệu sau khi chỉnh sửa
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeIdStr = req.getParameter("employeeId");
        int employeeId = Integer.parseInt(employeeIdStr);
        String name = req.getParameter("name");
        String position = req.getParameter("position");
        String salaryStr = req.getParameter("salary");
        String departmentIdStr = req.getParameter("departmentId");
        String hireDateStr = req.getParameter("hireDate");

        double salary = Double.parseDouble(salaryStr);
        int departmentId = Integer.parseInt(departmentIdStr);
        java.sql.Date hireDate = java.sql.Date.valueOf(hireDateStr);

        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(salary);
        employee.setDepartmentId(departmentId);
        employee.setHireDate(hireDate);

        boolean isSuccess = employeeService.updateEmployee(employee);
        if(isSuccess){
            resp.sendRedirect(req.getContextPath() + "/employee");
        } else {
            req.setAttribute("errorMessage", "Cập nhật nhân viên thất bại!");
            req.setAttribute("employee", employee);
            RequestDispatcher dispatcher = req.getRequestDispatcher("edit-employee.jsp");
            dispatcher.forward(req, resp);
        }
    }
}

