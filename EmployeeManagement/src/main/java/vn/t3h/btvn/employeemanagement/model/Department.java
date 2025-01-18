package vn.t3h.btvn.employeemanagement.model;

/**
 * Lớp mô tả thông tin của một phòng ban (Department).
 * Lớp này sử dụng để lưu trữ và quản lý dữ liệu về các phòng ban.
 */
public class Department {
    // Thuộc tính mã phòng ban
    private int departmentId;

    // Tên phòng ban
    private String departmentName;

    // Vị trí của phòng ban
    private String location;

    /**
     * Constructor không tham số.
     * Dùng khi cần khởi tạo một đối tượng Department trống.
     */
    public Department() {}

    /**
     * Constructor đầy đủ tham số.
     * Dùng khi cần khởi tạo đối tượng Department với thông tin cụ thể.
     *
     * @param departmentId   Mã phòng ban.
     * @param departmentName Tên phòng ban.
     * @param location       Vị trí của phòng ban.
     */
    public Department(int departmentId, String departmentName, String location) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
    }

    /**
     * Lấy mã phòng ban.
     *
     * @return Mã phòng ban.
     */
    public int getDepartmentId() {
        return departmentId;
    }

    /**
     * Gán mã phòng ban.
     *
     * @param departmentId Mã phòng ban cần gán.
     */
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * Lấy tên phòng ban.
     *
     * @return Tên phòng ban.
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Gán tên phòng ban.
     *
     * @param departmentName Tên phòng ban cần gán.
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Lấy vị trí của phòng ban.
     *
     * @return Vị trí phòng ban.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Gán vị trí của phòng ban.
     *
     * @param location Vị trí cần gán cho phòng ban.
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
