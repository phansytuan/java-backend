
package BaiKiemTraCuoiModule2.services;

import BaiKiemTraCuoiModule2.models.Account;
import BaiKiemTraCuoiModule2.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    // Thêm nhân viên
    public void addEmployee(Employee employee) throws Exception {
        // Kiểm tra trùng ID
        if (findById(employee.getId()) != null) {
            throw new Exception("ID nhân viên đã tồn tại: " + employee.getId());
        }
        employees.add(employee);
    }

    // Tìm nhân viên theo ID
    public Employee findById(String id) {
        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    // Lấy toàn bộ danh sách nhân viên
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Gán tài khoản cho nhân viên
    public void assignAccountToEmployee(Employee employee, Account account) throws Exception {
        // Kiểm tra nếu account đã có employeeInCharge
        if (account.getEmployeeInCharge() != null && account.getEmployeeInCharge() != employee) {
            throw new Exception("Tài khoản " + account.getAccountNumber() + " đã được gán cho nhân viên khác!");
        }
        // Gán
        employee.addAccount(account);
        account.setEmployeeInCharge(employee);
    }
}

