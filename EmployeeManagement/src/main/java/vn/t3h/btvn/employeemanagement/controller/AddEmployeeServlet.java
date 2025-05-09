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


@WebServlet(value = "/employee-add")
public class AddEmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        super.init();
        this.employeeService = new EmployeeServiceImpl(new EmployeeDaoMysqlImpl());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add-employee.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy dữ liệu từ form
        String name = req.getParameter("name");
        String position = req.getParameter("position");
        String salaryStr = req.getParameter("salary");
        String departmentIdStr = req.getParameter("departmentId");
        String hireDateStr = req.getParameter("hireDate");

        // Chuyển đổi dữ liệu
        double salary = Double.parseDouble(salaryStr);
        int departmentId = Integer.parseInt(departmentIdStr);
        java.sql.Date hireDate = java.sql.Date.valueOf(hireDateStr);

        // Tạo đối tượng Employee
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPosition(position);
        employee.setSalary(salary);
        employee.setDepartmentId(departmentId);
        employee.setHireDate(hireDate);

        // Gọi service thêm nhân viên
        boolean isSuccess = employeeService.addEmployee(employee);

        if(isSuccess){
            resp.sendRedirect(req.getContextPath() + "/employee");
        } else {
            req.setAttribute("errorMessage", "Thêm nhân viên thất bại!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("add-employee.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
