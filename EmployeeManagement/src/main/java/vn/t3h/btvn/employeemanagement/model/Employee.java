package vn.t3h.btvn.employeemanagement.model;

import java.sql.Date;

/**
 * Lớp mô tả thông tin của một nhân viên (Employee).
 * Lớp này được sử dụng để lưu trữ và quản lý dữ liệu về nhân viên.
 */
public class Employee {
    // Thuộc tính mã nhân viên
    private int employeeId;

    // Tên nhân viên
    private String name;

    // Chức vụ của nhân viên
    private String position;

    // Mức lương của nhân viên
    private double salary;

    // Mã phòng ban mà nhân viên thuộc về
    private int departmentId;

    // Ngày thuê/Ngày bắt đầu làm việc của nhân viên
    private Date hireDate;

    // Tên phòng ban (được sử dụng khi join với bảng Department)
    private String departmentName;

    /**
     * Constructor không tham số.
     * Dùng để khởi tạo một đối tượng Employee trống.
     */
    public Employee() {}

    /**
     * Constructor đầy đủ tham số.
     * Dùng để khởi tạo đối tượng Employee với thông tin cụ thể.
     *
     * @param employeeId    Mã nhân viên.
     * @param name          Tên nhân viên.
     * @param position      Chức vụ.
     * @param salary        Mức lương.
     * @param departmentId  Mã phòng ban.
     * @param hireDate      Ngày bắt đầu làm việc.
     * @param departmentName Tên phòng ban (hiển thị từ bảng Department).
     */
    public Employee(int employeeId, String name, String position, double salary,
                    int departmentId, Date hireDate, String departmentName) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.departmentId = departmentId;
        this.hireDate = hireDate;
        this.departmentName = departmentName;
    }

    /**
     * Lấy mã nhân viên.
     *
     * @return Mã nhân viên.
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * Gán mã nhân viên.
     *
     * @param employeeId Mã nhân viên cần gán.
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Lấy tên nhân viên.
     *
     * @return Tên nhân viên.
     */
    public String getName() {
        return name;
    }

    /**
     * Gán tên nhân viên.
     *
     * @param name Tên nhân viên cần gán.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Lấy chức vụ của nhân viên.
     *
     * @return Chức vụ của nhân viên.
     */
    public String getPosition() {
        return position;
    }

    /**
     * Gán chức vụ của nhân viên.
     *
     * @param position Chức vụ cần gán.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Lấy mức lương của nhân viên.
     *
     * @return Mức lương.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Gán mức lương cho nhân viên.
     *
     * @param salary Mức lương cần gán.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Lấy mã phòng ban mà nhân viên thuộc về.
     *
     * @return Mã phòng ban.
     */
    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * Gán mã phòng ban cho nhân viên.
     *
     * @param departmentId Mã phòng ban cần gán.
     */
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Lấy ngày bắt đầu làm việc của nhân viên.
     *
     * @return Ngày bắt đầu làm việc.
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * Gán ngày bắt đầu làm việc cho nhân viên.
     *
     * @param hireDate Ngày cần gán.
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * Lấy tên phòng ban của nhân viên.
     *
     * @return Tên phòng ban.
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Gán tên phòng ban cho nhân viên.
     *
     * @param departmentName Tên phòng ban cần gán.
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
