package vn.t3h.employeemanager.utils;

import vn.t3h.employeemanager.config.ConfigInit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load MySQL driver!");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        // Sử dụng các giá trị cấu hình từ class Config Init
        return DriverManager.getConnection(ConfigInit.DB_URL, ConfigInit.DB_USERNAME, ConfigInit.DB_PASSWORD);
    }
}