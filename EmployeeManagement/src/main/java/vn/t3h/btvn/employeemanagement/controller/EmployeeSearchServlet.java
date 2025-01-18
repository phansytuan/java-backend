package vn.t3h.btvn.employeemanagement.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.service.EmployeeService;

import java.io.IOException;
import java.util.List;
// @WebServlet(value = "/employee")
// Chỉ định URL mapping cho Servlet, đây là cách 2 thay cho config bên web.xml

public class EmployeeSearchServlet extends HttpServlet {
    private EmployeeService employeeService;

    // Phương thức init() được gọi một lần khi Servlet được khởi tạo
    @Override
    public void init() throws ServletException {
        super.init();
        // Khởi tạo đối tượng EmployeeService để sử dụng trong các phương thức khác
        employeeService = new EmployeeService();
    }

    // Xử lý các yêu cầu GET (khi người dùng truy cập URL hoặc sử dụng method GET)
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy các tham số từ request. Các tham số này được gửi từ form trên giao diện người dùng.
        String name = request.getParameter("name");
        String salary = request.getParameter("salary");
        String fromHireDate = request.getParameter("fromHireDate");
        String toHireDate = request.getParameter("toHireDate");
        String position = request.getParameter("position");
        String departmentId = request.getParameter("departmentId");

        // Gọi service để tìm kiếm danh sách nhân viên dựa trên các tham số được cung cấp
        List<Employee> employees = employeeService.searchEmployees(
                name,          // Tên nhân viên
                salary,        // Mức lương (theo chuỗi)
                fromHireDate,  // Ngày bắt đầu khoảng thời gian thuê
                toHireDate,    // Ngày kết thúc khoảng thời gian thuê
                position,      // Vị trí công việc
                departmentId   // Mã phòng ban
        );

        // Đặt danh sách nhân viên vào request attribute để truyền dữ liệu đến trang JSP
        request.setAttribute("employeeList", employees);

        // Chuyển hướng yêu cầu tới file JSP để hiển thị kết quả tìm kiếm
        request.getRequestDispatcher("employee-search.jsp").forward(request, response);
    }

    // Xử lý các yêu cầu POST (khi form sử dụng method POST)
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Chuyển tiếp yêu cầu POST sang phương thức doGet để tái sử dụng logic xử lý
        doGet(request, response);
    }
}