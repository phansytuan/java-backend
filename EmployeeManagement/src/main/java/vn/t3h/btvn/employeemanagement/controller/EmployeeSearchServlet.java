package vn.t3h.btvn.employeemanagement.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.t3h.btvn.employeemanagement.dao.impl.EmployeeDaoMysqlImpl;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.service.IEmployeeService;
import vn.t3h.btvn.employeemanagement.service.impl.EmployeeServiceImpl;
import java.io.IOException;
import java.util.List;

/* @WebServlet("/employee")
    là Cách 2: (chỉ định url) Mapping servlet thay vì cấu hình trong web.xml */
public class EmployeeSearchServlet extends HttpServlet {
    private IEmployeeService employeeService;

    // Phương thức init() được gọi một lần khi Servlet được khởi tạo
    @Override
    public void init() throws ServletException {
        super.init();
        // Khởi tạo đối tượng employeeService để sử dụng trong các phương thức khác
        this.employeeService = new EmployeeServiceImpl(new EmployeeDaoMysqlImpl());
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
                name,
                salary,
                fromHireDate,
                toHireDate,
                position,
                departmentId
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
