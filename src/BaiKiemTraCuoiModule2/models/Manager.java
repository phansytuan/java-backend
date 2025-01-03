package BaiKiemTraCuoiModule2.models;

public class Manager extends Employee {

    public Manager(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        // Giả sử quản lý có thưởng = 20% lương cơ bản
        return getSalary() * 0.2;
    }
}
