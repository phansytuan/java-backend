package vn.t3h.btvn.employeemanagement.service.impl;

import vn.t3h.btvn.employeemanagement.dao.IEmployeeDao;
import vn.t3h.btvn.employeemanagement.model.Employee;
import vn.t3h.btvn.employeemanagement.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private final IEmployeeDao employeeDao;

    /* Constructor cho lớp EmployeeServiceImpl.
        tại đây, đối tượng employeeDao được khởi tạo.
        dùng DI (Dependency Injection) --> truyền employeeDao qua constructor.
     */
    public EmployeeServiceImpl(IEmployeeDao employeeDao) {
        // Khởi tạo đối tượng DAO
        this.employeeDao = employeeDao;
    }

    /* Tìm kiếm danh sách nhân viên dựa trên các điều kiện đầu vào.
       Trước khi gọi DAO, các tham số đầu vào được xử lý/validate.

        @param name, salary, fromHireDate, toHireDate, position, departmentId  Mã phòng ban.
        @return Danh sách nhân viên phù hợp với điều kiện tìm kiếm.
     */
    @Override
    public List<Employee> searchEmployees(
            String name,
            String salary,
            String fromHireDate,
            String toHireDate,
            String position,
            String departmentId
    ) {
        return employeeDao.searchEmployees(
                emptyToNull(name),
                emptyToNull(salary),
                emptyToNull(fromHireDate),
                emptyToNull(toHireDate),
                emptyToNull(position),
                emptyToNull(departmentId)
        );
    }
//    Gọi các phương thức...(...) từ lớp employeeDao (Data Access Object).
    @Override
    public boolean addEmployee(Employee employee) {
        return employeeDao.insertEmployee(employee) > 0;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return employeeDao.getEmployeeById(employeeId);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee) > 0;
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
        return employeeDao.deleteEmployee(employeeId) > 0;
    }
    /* Hàm tiện ích để chuyển đổi chuỗi rỗng hoặc chứa toàn khoảng trắng thành null.
       Nếu chuỗi hợp lệ, loại bỏ khoảng trắng thừa ở đầu/cuối chuỗi.

       @param str Chuỗi đầu vào.
       @return Chuỗi đã xử lý hoặc null nếu chuỗi rỗng.
    */
    private String emptyToNull(String str) {
        return (str == null || str.trim().isEmpty()) ? null : str.trim();
    }
}
