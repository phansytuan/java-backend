package vn.t3h.btvn.employeemanagement.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.service.EmployeeService;

import java.io.IOException;
import java.util.List;
//@WebServlet(value = "employee")


public class EmployeeSearchServlet extends HttpServlet {
    private EmployeeService employeeService;

    @Override
    public void init() throws ServletException {
        super.init();
        // Khởi tạo service khi Servlet được load
        employeeService = new EmployeeService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy các tham số từ request
        String name = request.getParameter("name");
        String salary = request.getParameter("salary");
        String fromHireDate = request.getParameter("fromHireDate");
        String toHireDate = request.getParameter("toHireDate");
        String position = request.getParameter("position");
        String departmentId = request.getParameter("departmentId");

        // Gọi service để tìm kiếm
        List<Employee> employees = employeeService.searchEmployees(
                name,
                salary,
                fromHireDate,
                toHireDate,
                position,
                departmentId
        );

        // Đưa kết quả vào request
        request.setAttribute("employeeList", employees);

        // Forward về trang JSP
        request.getRequestDispatcher("employee-search.jsp").forward(request, response);
    }

    // Nếu form dùng method POST, gọi sang doGet
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
