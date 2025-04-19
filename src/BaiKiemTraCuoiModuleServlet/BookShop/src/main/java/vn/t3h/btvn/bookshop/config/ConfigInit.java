package vn.t3h.btvn.bookshop.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigInit {

    // Khai báo các biến static cho cấu hình cơ sở dữ liệu
    public static String DB_URL;
    public static String DB_USERNAME;
    public static String DB_PASSWORD;

    public static String BASE_URL;

    static {
        try (InputStream input = ConfigInit.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new IOException("Unable to find application.properties");
            }
            // Tạo đối tượng Properties và tải dữ liệu từ tệp
            Properties properties = new Properties();
            properties.load(input);

            // Đọc các giá trị từ tệp cấu hình
            DB_URL = properties.getProperty("db.url");
            DB_USERNAME = properties.getProperty("db.username");
            DB_PASSWORD = properties.getProperty("db.password");
            // Đọc baseUrl từ config
            BASE_URL = properties.getProperty("baseUrl");

        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to load configuration");
        }
    }
}

