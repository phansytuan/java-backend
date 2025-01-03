
package BaiKiemTraCuoiModule2.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String id;              // ID nhân viên
    private String name;            // Tên nhân viên
    private double salary;          // Lương cơ bản
    private List<Account> managedAccounts; // Danh sách tài khoản mà nhân viên quản lý

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managedAccounts = new ArrayList<>();
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public List<Account> getManagedAccounts() {
        return managedAccounts;
    }

    // Mỗi lớp con của Employee sẽ định nghĩa cách tính thưởng riêng
    public abstract double calculateBonus();

    // Thêm tài khoản vào danh sách quản lý
    public void addAccount(Account account) {
        if (account != null) {
            managedAccounts.add(account);
        }
    }

    // Xử lý giao dịch (ví dụ minh họa, logic thực tế có thể phức tạp hơn)
    public void processTransaction(Transaction transaction) {
        // Tùy theo type mà ta xử lý
        // Ví dụ: transaction.getType() -> "Deposit", "Withdraw", "Transfer"
        // Ở đây có thể implement logic để ghi log, kiểm tra, duyệt giao dịch...
        System.out.println("Nhân viên " + this.name + " đang xử lý giao dịch: " + transaction);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", numberOfManagedAccounts=" + managedAccounts.size() +
                '}';
    }
}
