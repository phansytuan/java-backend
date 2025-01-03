package BaiKiemTraCuoiModule2.models;

public class Teller extends Employee {

    public Teller(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        // Giả sử giao dịch viên có thưởng = 10% lương cơ bản
        return getSalary() * 0.1;
    }
}
