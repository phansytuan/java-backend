
package BaiKiemTraCuoiModule2.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;    // Số tài khoản
    private String accountHolder;    // Tên chủ tài khoản
    private double balance;          // Số dư tài khoản
    private Employee employeeInCharge;    // Nhân viên phụ trách
    private List<Transaction> transactionList; // Danh sách giao dịch liên quan

    // Constructor
    public Account(String accountNumber, String accountHolder, double balance, Employee employeeInCharge) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.employeeInCharge = employeeInCharge;
        this.transactionList = new ArrayList<>();
    }

    // Getter & Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public Employee getEmployeeInCharge() {
        return employeeInCharge;
    }

    public void setEmployeeInCharge(Employee employeeInCharge) {
        this.employeeInCharge = employeeInCharge;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    // Phương thức nạp tiền
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền nạp phải lớn hơn 0.");
        }
        this.balance += amount;
    }

    // Phương thức rút tiền
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải lớn hơn 0.");
        }
        if (this.balance < amount) {
            throw new IllegalArgumentException("Số dư không đủ để thực hiện giao dịch rút tiền.");
        }
        this.balance -= amount;
    }

    // Thêm một giao dịch vào danh sách của account
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    @Override
    public String toString() {
        return "Account{ " +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", employeeInCharge=" + (employeeInCharge != null ? employeeInCharge.getName() : "Chưa có") +
                " }";
    }
}
