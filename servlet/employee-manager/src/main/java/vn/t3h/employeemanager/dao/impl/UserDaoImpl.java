package vn.t3h.employeemanager.dao.impl;

import vn.t3h.employeemanager.dao.UserDao;
import vn.t3h.employeemanager.model.UserModel;
import vn.t3h.employeemanager.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    // Phương thức tìm người dùng theo tên đăng nhập và mật khẩu
    public UserModel findUserByUserNameAndPassword(String username, String password) {
        UserModel userModel = null;
        String sql = "SELECT u.id, u.username, u.password, u.full_name, u.deleted, u.role_id, r.name AS role_name " +
                "FROM user u " +
                "JOIN role r ON u.role_id = r.id " +
                "WHERE u.username = ? AND u.password = ? AND u.deleted = 0";

        // nếu viết trong try thì connection sẽ tự động được close, áp dụng cho version jdbc  moi
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, username); // Set tên đăng nhập
            preparedStatement.setString(2, password); // Set mật khẩu
            // tuong tu connection
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    // Lấy dữ liệu từ kết quả truy vấn và gán vào đối tượng UserModel
                    Integer id = resultSet.getInt("id");
                    String fullName = resultSet.getString("full_name");
                    boolean deleted = resultSet.getBoolean("deleted");
                    Integer roleId = resultSet.getInt("role_id");

                    // Tạo đối tượng UserModel từ dữ liệu truy vấn
                    userModel = new UserModel(id, username, password, fullName, deleted, roleId);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userModel;
    }

}