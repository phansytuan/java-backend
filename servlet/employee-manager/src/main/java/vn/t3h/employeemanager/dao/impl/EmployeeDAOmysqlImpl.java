package vn.t3h.employeemanager.dao.impl;

import vn.t3h.employeemanager.dao.EmployeeDAO;
import vn.t3h.employeemanager.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOmysqlImpl implements EmployeeDAO {
    @Override
    public List<Employee> getAllEmployee() {
        // tạo connection đến db sau khi đã có các (dependency) thư viện cần thiết
        Connection conn = getConnection();
        List<Employee> employeesResult = new ArrayList<>();

        // tạo câu query
        String sql = "SELECT * FROM employees emp INNER JOIN departments dept ON emp.department_id = dept.department_id;";

        try{
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
        // thực thi câu query
        ResultSet resultSet = preparedStmt.executeQuery();
        // lấy ra dữ liệu từ câu query đưa vào object java
            while (resultSet.next()) {
                Employee employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getDouble("salary"));
                employee.setDepartmentName(resultSet.getString("department_name"));
                employee.setHireDate(resultSet.getString("hire_date"));

                employeesResult.add(employee);
            }
            System.out.println("Get employees successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

//        trả về kết quả là danh sách employee
        return employeesResult;
    }
    public Connection getConnection() {
        String url="jdbc:mysql://localhost:3306/quanlynhansuservlet";
        String username="root";
        String password="Pst13052003#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,username,password);
            System.out.println("get Connected to database successfully");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
