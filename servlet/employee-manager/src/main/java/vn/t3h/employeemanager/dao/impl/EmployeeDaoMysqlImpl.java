package vn.t3h.employeemanager.dao.impl;

import vn.t3h.employeemanager.dao.EmployeeDao;
import vn.t3h.employeemanager.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoMysqlImpl implements EmployeeDao {

    @Override
    public List<Employee> getAllEmployee() {

        // tạo connection đến database
        Connection connection = getConnection();
        List<Employee> employeesResult = new ArrayList<>();
        // tạo câu query
        String sql = "select * from employees emp " +
                "inner join departments dept on emp.department_id = dept.department_id;";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            // thực thi câu query
            ResultSet resultSet = statement.executeQuery();
            // lấy ra dữ liệu từ câu query đưa vào object java
            while (resultSet.next()){
                Employee employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getDouble("salary"));
                employee.setDepartmentName(resultSet.getString("department_name"));
                employee.setHireDate(resultSet.getString("hire_date"));

                employeesResult.add(employee);
            }
            System.out.println("get employee success");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            closeConnection(connection);
        }
        // trả về kết quả là danh sach employee
        return employeesResult;
    }

    private static void closeConnection(Connection connection) {
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Employee> findByCondition(String name, String salary, String fromDate, String toDate, String position){
        String sql = "SELECT e.employee_id, e.name, e.position, e.salary, d.department_name, e.hire_date\n" +
                "FROM employees e\n" +
                "         LEFT JOIN departments d ON e.department_id = d.department_id\n" +
                "WHERE (e.name LIKE ? OR ? IS NULL)\n" +
                "  AND (e.salary = ? OR ? IS NULL)\n" +
                "  AND (e.hire_date >= ? or ? is NULL)\n" +
                "  AND (e.hire_date <= ? or ? is NULL)\n" +
                "  AND (e.position LIKE ? OR ? IS NULL)\n;";

        Connection connection = null;
        List<Employee> employees = new ArrayList<>();
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            setConditionFilter(name, salary, fromDate, toDate, position, statement);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Employee employee = new Employee();
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getDouble("salary"));
                employee.setDepartmentName(resultSet.getString("department_name"));
                employee.setHireDate(resultSet.getString("hire_date"));
                employees.add(employee);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return employees;
    }

    private static void setConditionFilter(String name, String salary, String fromDate, String toDate, String position, PreparedStatement statement) throws SQLException {
        if (name != null){
            statement.setString(1, "%" + name + "%");
            statement.setString(2, "%" + name + "%");
        }else {
            statement.setNull(1, Types.VARCHAR);
            statement.setNull(2, Types.VARCHAR);
        }

        if (salary != null){
            statement.setLong(3, Long.parseLong(salary));
            statement.setLong(4, Long.parseLong(salary));
        }else {
            statement.setNull(3, Types.DECIMAL);
            statement.setNull(4, Types.DECIMAL);
        }

        if (fromDate != null){
            statement.setString(5, fromDate);
            statement.setString(6, fromDate);
        }else {
            statement.setNull(5, Types.VARCHAR);
            statement.setNull(6, Types.VARCHAR);
        }

        if (toDate != null){
            statement.setString(7, toDate);
            statement.setString(8, toDate);
        }else {
            statement.setNull(7, Types.VARCHAR);
            statement.setNull(8, Types.VARCHAR);
        }

        if (position != null){
            statement.setString(9, "%" + position + "%");
            statement.setString(10, "%" + position + "%");
        }else {
            statement.setNull(9, Types.VARCHAR);
            statement.setNull(10, Types.VARCHAR);
        }
    }

    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/quanlynhansu";
        String username = "root";
        String password = "Pst13052003#";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("get connection success");
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
