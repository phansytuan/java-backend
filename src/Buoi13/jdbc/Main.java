package Buoi13.jdbc;
import java.sql.*;

public class Main {
    public static final String url = "jdbc:mysql://localhost:3306/quanlynhansu";
    public static final String user = "root";
    public static final String password = "Pst13052003#";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            // Establish the connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully");

            // Prepare the query
            String sql = "SELECT * FROM departments";
            System.out.println("Convert string " + sql + " into SQL");
            pst = conn.prepareStatement(sql);

            // Execute the query and get the result set
            System.out.println("Querying in database");
            rs = pst.executeQuery();

            // Process the result set
            System.out.println("Querying result set");
            while (rs.next()) {
                int deptID = rs.getInt("department_id");
                System.out.println("Department ID: " + deptID);
                String deptName = rs.getString("department_name");
                System.out.println("Department Name: " + deptName);
                String location = rs.getString("department_location");
                System.out.println("Department Location: " + location);
            }
        } catch (SQLException e) {
            System.out.println("Connection problem");
            e.printStackTrace();
        } finally {
            // Close resources in the finally block to ensure they are closed even in case of an exception
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
