package vn.t3h.btvn.employeemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    // URL kết nối tới MySQL, bạn sửa lại cho đúng tên DB của mình
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Pst13052003#"; // Sửa lại cho đúng password của bạn

    public static Connection getConnection() throws SQLException {
        try {
            // Nếu dùng MySQL Connector phiên bản mới:
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("MySQL Driver not found!");
        }
    }
}
