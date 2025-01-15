package vn.t3h.btvn.employeemanagement.model;

import java.sql.Date;

public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double salary;
    private int departmentId;
    private Date hireDate;
    private String departmentName; // Để hiển thị tên phòng ban (join với bảng Department)

    public Employee() {}

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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
