package vn.t3h.btvn.employeemanagement.dao.impl;

import vn.t3h.btvn.employeemanagement.dao.IEmployeeDao;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.utils.DBConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoMysqlImpl implements IEmployeeDao {
    @Override
    public List<Employee> searchEmployees(String name, String salaryStr, String fromHireDate, String toHireDate, String position, String departmentId)
    {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT e.employee_id, e.name, e.position, e.salary, d.department_name, e.hire_date " +
                     "FROM employees e " +
                     "LEFT JOIN departments d ON e.department_id = d.department_id " +
                     "WHERE 1=1 ";

        if (name != null) sql += " AND e.name LIKE ? ";
        if (salaryStr != null) sql += " AND e.salary >= ? ";
        if (fromHireDate != null && toHireDate != null) sql += " AND e.hire_date BETWEEN ? AND ? ";
        if (position != null) sql += " AND e.position LIKE ? ";
        if (departmentId != null) sql += " AND e.department_id = ? ";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            int idx = 1;
            if (name != null) ps.setString(idx++, "%" + name + "%");
            if (salaryStr != null) ps.setDouble(idx++, Double.parseDouble(salaryStr));
            if (fromHireDate != null && toHireDate != null) {
                ps.setDate(idx++, Date.valueOf(fromHireDate));
                ps.setDate(idx++, Date.valueOf(toHireDate));
            }
            if (position != null) ps.setString(idx++, "%" + position + "%");
            if (departmentId != null) ps.setInt(idx++, Integer.parseInt(departmentId));

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

    @Override
    public int insertEmployee(Employee employee) {
        String sql = "INSERT INTO employees (name, position, salary, department_id, hire_date) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPosition());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getDepartmentId());
            ps.setDate(5, new java.sql.Date(employee.getHireDate().getTime()));
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        String sql = "SELECT employee_id, name, position, salary, department_id, hire_date FROM employees WHERE employee_id = ?";
        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Employee emp = new Employee();
                emp.setEmployeeId(rs.getInt("employee_id"));
                emp.setName(rs.getString("name"));
                emp.setPosition(rs.getString("position"));
                emp.setSalary(rs.getDouble("salary"));
                emp.setDepartmentId(rs.getInt("department_id"));
                emp.setHireDate(rs.getDate("hire_date"));
                return emp;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = "UPDATE employees SET name = ?, position = ?, salary = ?, department_id = ?, hire_date = ? WHERE employee_id = ?";
        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getPosition());
            ps.setDouble(3, employee.getSalary());
            ps.setInt(4, employee.getDepartmentId());
            ps.setDate(5, new java.sql.Date(employee.getHireDate().getTime()));
            ps.setInt(6, employee.getEmployeeId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteEmployee(int employeeId) {
        String sql = "DELETE FROM employees WHERE employee_id = ?";
        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}

