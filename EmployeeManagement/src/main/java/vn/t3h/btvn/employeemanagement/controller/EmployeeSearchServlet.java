package vn.t3h.btvn.employeemanagement.controller;

import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.util.DBConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSearchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy các tham số từ request
        String name = request.getParameter("name");
        String salaryStr = request.getParameter("salary");
        String fromHireDate = request.getParameter("fromHireDate");
        String toHireDate = request.getParameter("toHireDate");
        String position = request.getParameter("position");
        String departmentId = request.getParameter("departmentId");

        // Xử lý null hoặc chuỗi rỗng -> chuyển thành null để bỏ qua tiêu chí
        name = (name == null || name.trim().isEmpty()) ? null : name.trim();
        salaryStr = (salaryStr == null || salaryStr.trim().isEmpty()) ? null : salaryStr.trim();
        fromHireDate = (fromHireDate == null || fromHireDate.trim().isEmpty()) ? null : fromHireDate.trim();
        toHireDate = (toHireDate == null || toHireDate.trim().isEmpty()) ? null : toHireDate.trim();
        position = (position == null || position.trim().isEmpty()) ? null : position.trim();
        departmentId = (departmentId == null || departmentId.trim().isEmpty()) ? null : departmentId.trim();

        List<Employee> employees = new ArrayList<>();

        // Phần SQL cơ bản
        String sql = "SELECT e.employee_id, e.name, e.position, e.salary, d.department_name, e.hire_date " +
                "FROM employees e " +
                "LEFT JOIN departments d ON e.department_id = d.department_id " +
                "WHERE 1=1 "; // 1=1 để dễ nối AND

        /*
         * Ta sẽ nối thêm các điều kiện (AND ...) tuỳ thuộc vào tham số khác null.
         * Sau đó dùng PreparedStatement để gán giá trị.
         */

        if (name != null) {
            sql += " AND e.name LIKE ? ";
        }
        if (salaryStr != null) {
            sql += " AND e.salary >= ? ";
        }
        if (fromHireDate != null && toHireDate != null) {
            sql += " AND e.hire_date BETWEEN ? AND ? ";
        }
        if (position != null) {
            sql += " AND e.position LIKE ? ";
        }
        if (departmentId != null) {
            sql += " AND e.department_id = ? ";
        }

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // Duyệt để set giá trị cho các placeholder
            int idx = 1;
            if (name != null) {
                ps.setString(idx++, "%" + name + "%");
            }
            if (salaryStr != null) {
                double salary = Double.parseDouble(salaryStr);
                ps.setDouble(idx++, salary);
            }
            if (fromHireDate != null && toHireDate != null) {
                ps.setDate(idx++, Date.valueOf(fromHireDate));
                ps.setDate(idx++, Date.valueOf(toHireDate));
            }
            if (position != null) {
                ps.setString(idx++, "%" + position + "%");
            }
            if (departmentId != null) {
                ps.setInt(idx++, Integer.parseInt(departmentId));
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmployeeId(rs.getInt("employee_id"));
                emp.setName(rs.getString("name"));
                emp.setPosition(rs.getString("position"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setDepartmentName(rs.getString("department_name"));
                emp.setHireDate(rs.getDate("hire_date"));
                employees.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Đưa danh sách tìm được sang JSP
        request.setAttribute("employeeList", employees);

        // Forward về EmployeeSearch.jsp để hiển thị
        request.getRequestDispatcher("/EmployeeSearch.jsp").forward(request, response);
    }

    // Nếu form dùng method POST, ta có thể cho doPost gọi doGet
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

