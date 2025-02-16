package vn.t3h.btvn.employeemanagement.dao.impl;
import vn.t3h.btvn.employeemanagement.dao.IEmployeeDao;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.utils.DBConnectionUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoMysqlImpl implements IEmployeeDao {
    /* Tìm kiếm danh sách nhân viên dựa trên các điều kiện đầu vào.
        @param name, salaryStr, fromHireDate, toHireDate, position, departmentId
        @return Danh sách nhân viên phù hợp với điều kiện tìm kiếm.
     */
    @Override
    public List<Employee> searchEmployees(
            String name,
            String salaryStr,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    ) {
        // Tạo danh sách để lưu trữ kết quả tìm kiếm
        List<Employee> employees = new ArrayList<>();

        // Câu truy vấn SQL cơ bản
        String sql = "SELECT e.employee_id, e.name, e.position, e.salary, d.department_name, e.hire_date " +
                     "FROM employees e " +
                     "LEFT JOIN departments d ON e.department_id = d.department_id " +
                     "WHERE 1=1 ";  // Sử dụng 1=1 để dễ dàng thêm các điều kiện động

        // Tạo các điều kiện động dựa trên các tham số đầu vào (cộng chuỗi trong sql)
        if (name != null) {
            sql += " AND e.name LIKE ? "; // Tìm kiếm tên có chứa chuỗi con
        }
        if (salaryStr != null) {
            sql += " AND e.salary >= ? "; // Lọc các nhân viên có lương lớn hơn hoặc bằng giá trị nhập
        }
        if (fromHireDate != null && toHireDate != null) {
            sql += " AND e.hire_date BETWEEN ? AND ? "; // Tìm kiếm trong khoảng thời gian thuê
        }
        if (position != null) {
            sql += " AND e.position LIKE ? "; // Tìm kiếm vị trí công việc có chứa chuỗi con
        }
        if (departmentId != null) {
            sql += " AND e.department_id = ? "; // Lọc theo mã phòng ban
        }


        // Kết nối với cơ sở dữ liệu và thực thi truy vấn
        try (Connection conn = DBConnectionUtil.getConnection();    // Kết nối cơ sở dữ liệu
             PreparedStatement ps = conn.prepareStatement(sql)) {   // Tạo PreparedStatement để tránh SQL injection

            // Gán giá trị cho các tham số trong câu truy vấn
            int idx = 1;
            if (name != null) {
                ps.setString(idx++, "%" + name + "%"); // Sử dụng ký tự % cho tìm kiếm chuỗi con
            }
            if (salaryStr != null) {
                double salary = Double.parseDouble(salaryStr); // Chuyển đổi salary từ chuỗi sang số
                ps.setDouble(idx++, salary);
            }
            if (fromHireDate != null && toHireDate != null) {
                ps.setDate(idx++, Date.valueOf(fromHireDate)); // Chuyển chuỗi thành kiểu Date
                ps.setDate(idx++, Date.valueOf(toHireDate));
            }
            if (position != null) {
                ps.setString(idx++, "%" + position + "%"); // Sử dụng ký tự % cho tìm kiếm chuỗi con
            }
            if (departmentId != null) {
                ps.setInt(idx++, Integer.parseInt(departmentId)); // Chuyển chuỗi sang số nguyên
            }

            // Thực thi truy vấn và lấy kết quả
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // Tạo đối tượng Employee từ mỗi dòng kết quả
                Employee emp = new Employee();
                emp.setEmployeeId(rs.getInt("employee_id")); // Gán giá trị ID nhân viên
                emp.setName(rs.getString("name"));           // Gán giá trị tên nhân viên
                emp.setPosition(rs.getString("position"));   // Gán vị trí công việc
                emp.setSalary(rs.getDouble("salary"));       // Gán mức lương
                emp.setDepartmentName(rs.getString("department_name")); // Gán tên phòng ban
                emp.setHireDate(rs.getDate("hire_date"));    // Gán ngày thuê
                employees.add(emp); // Thêm vào danh sách nhân viên
            }
        } catch (SQLException e) {
            // In ra lỗi nếu xảy ra ngoại lệ trong quá trình kết nối hoặc thực thi SQL
            e.printStackTrace();
        }
        // Trả về danh sách nhân viên tìm được
        return employees;
    }
}
