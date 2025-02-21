package vn.t3h.employeemanager.model;

public class RoleModel {
    private int id;        // Khóa chính
    private String name;   // Tên vai trò
    private String code;   // Mã vai trò

    // Constructor
    public RoleModel(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // Getter và Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // Override toString method for easy printing
    @Override
    public String toString() {
        return "Role{id=" + id + ", name='" + name + "', code='" + code + "'}";
    }
}
