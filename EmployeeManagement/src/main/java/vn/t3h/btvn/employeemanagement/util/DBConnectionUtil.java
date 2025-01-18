package vn.t3h.btvn.employeemanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    // URL kết nối tới MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Pst13052003#";

    /* Phương thức lấy kết nối tới cơ sở dữ liệu.
     *
     * @return Đối tượng Connection dùng để thực hiện các thao tác với cơ sở dữ liệu.
     * @throws SQLException Nếu xảy ra lỗi khi kết nối tới cơ sở dữ liệu.
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Tải driver MySQL JDBC (chỉ cần cho các phiên bản Java cũ).
            // Với các phiên bản mới hơn, driver có thể tự động được tải.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Trả về đối tượng Connection thông qua DriverManager
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // Xử lý nếu driver không được tìm thấy
            e.printStackTrace(); // Ghi log thông báo lỗi
            throw new SQLException("MySQL Driver not found!"); // Ném ngoại lệ để báo lỗi
        }
    }
}
