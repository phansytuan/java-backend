package vn.t3h.btvn.employeemanagement.dao;

import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.util.DBConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    public List<Employee> searchEmployees(
            String name,
            String salaryStr,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    ) {
        List<Employee> employees = new ArrayList<>();

        String sql = "SELECT e.employee_id, e.name, e.position, e.salary, d.department_name, e.hire_date " +
                "FROM employees e " +
                "LEFT JOIN departments d ON e.department_id = d.department_id " +
                "WHERE 1=1 ";

        // Tạo điều kiện động
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

        return employees;
    }
}

