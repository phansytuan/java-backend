package Buoi13.jdbc;
import java.sql.*;

public class Main {
    // Thông tin kết nối đến cơ sở dữ liệu
    public static final String URL = "jdbc:mysql://localhost:3306/quanlynhansu";
    public static final String USER = "root";
    public static final String PASSWORD = "Pst13052003#";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Kết nối cơ sở dữ liệu thành công.");

            // Hiển thị danh sách phòng ban
            showAllDepartments(conn);

            // Thêm một phòng ban mới
            insertDepartment(conn, 5, "DevOps", "Ha Noi");
        }
        catch (SQLException e) {
            // Thông báo lỗi nếu không kết nối được hoặc có vấn đề khi thao tác với cơ sở dữ liệu
            System.err.println("Lỗi kết nối cơ sở dữ liệu: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
        Hiển thị danh sách tất cả các phòng ban trong cơ sở dữ liệu.
            @param conn Đối tượng Connection đã kết nối với cơ sở dữ liệu.
    */
    private static void showAllDepartments(Connection conn) {
        String sql = "SELECT * FROM departments";

        // Thực thi truy vấn và xử lý kết quả
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            System.out.println("Danh sách phòng ban:");

            // Duyệt qua các kết quả trả về và in ra từng phòng ban
            while (resultSet.next()) {
                System.out.println("----------------------------------------");
                System.out.println("Mã Phòng Ban: " + resultSet.getInt("department_id"));
                System.out.println("Tên Phòng Ban: " + resultSet.getString("department_name"));
                System.out.println("Địa Điểm: " + resultSet.getString("location"));
            }
        } catch (SQLException e) {
            System.err.println("Lỗi khi truy vấn danh sách phòng ban: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /*
     Thêm một phòng ban mới vào cơ sở dữ liệu.
       @param conn    Đối tượng Connection đã kết nối với cơ sở dữ liệu.
       @param id      Mã phòng ban.
       @param name    Tên phòng ban.
       @param location Địa điểm của phòng ban.
    */
    private static void insertDepartment(Connection conn, int id, String name, String location) {
        String sql = "INSERT INTO departments (department_id, department_name, location) VALUES (?, ?, ?)";

        // Chuẩn bị và thực thi câu lệnh
        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            // Thiết lập giá trị cho các tham số của câu lệnh SQL
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, location);

            // Thực thi câu lệnh và trả về số bản ghi được thêm
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println("Số lượng bản ghi vừa được thêm: " + rowsInserted);
        }
        catch (SQLException e) {
            System.err.println("Lỗi khi thêm phòng ban: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
