package vn.t3h.btvn.employeemanagement.service;

import vn.t3h.btvn.employeemanagement.dao.EmployeeDao;
import vn.t3h.btvn.employeemanagement.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDao employeeDao;
    /* Constructor cho lớp EmployeeService.
     * Tại đây, đối tượng EmployeeDao được khởi tạo.
     * Nếu dùng DI (Dependency Injection), có thể truyền EmployeeDao qua constructor.
     */
    public EmployeeService() {
        // Khởi tạo đối tượng DAO
        this.employeeDao = new EmployeeDao();
    }

    /* Tìm kiếm danh sách nhân viên dựa trên các điều kiện đầu vào.
     * Trước khi gọi DAO, các tham số đầu vào được xử lý/validate.
     *
     * @param name          Tên nhân viên.
     * @param salary        Mức lương tối thiểu (chuỗi).
     * @param fromHireDate  Ngày bắt đầu khoảng thời gian thuê.
     * @param toHireDate    Ngày kết thúc khoảng thời gian thuê.
     * @param position      Vị trí công việc.
     * @param departmentId  Mã phòng ban.
     * @return Danh sách nhân viên phù hợp với điều kiện tìm kiếm.
     */
    public List<Employee> searchEmployees(
            String name,
            String salary,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    ) {
        // Validate và xử lý các tham số đầu vào trước khi gọi DAO
        // Ví dụ: cắt bỏ khoảng trắng, chuyển chuỗi rỗng thành null để phù hợp với SQL

        return employeeDao.searchEmployees(
                emptyToNull(name),          // Xử lý chuỗi tên
                emptyToNull(salary),        // Xử lý chuỗi mức lương
                emptyToNull(fromHireDate),  // Xử lý ngày bắt đầu
                emptyToNull(toHireDate),    // Xử lý ngày kết thúc
                emptyToNull(position),      // Xử lý vị trí công việc
                emptyToNull(departmentId)   // Xử lý mã phòng ban
        );
    }

    /* Hàm tiện ích để chuyển đổi chuỗi rỗng hoặc chứa toàn khoảng trắng thành `null`.
     * Nếu chuỗi hợp lệ, loại bỏ khoảng trắng thừa ở đầu/cuối chuỗi.
     *
     * @param str Chuỗi đầu vào.
     * @return Chuỗi đã xử lý hoặc `null` nếu chuỗi rỗng.
     */
    private String emptyToNull(String str) {
        if (str == null || str.trim().isEmpty()) {
            return null; // Chuỗi rỗng hoặc chỉ chứa khoảng trắng sẽ được chuyển thành null
        }
        return str.trim(); // Loại bỏ khoảng trắng thừa ở đầu/cuối
    }
}
