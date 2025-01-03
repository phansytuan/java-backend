
package BaiKiemTraCuoiModule2.models;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;    // ID giao dịch
    private Account account;         // Tài khoản liên quan
    private Employee employee;       // Nhân viên thực hiện
    private String type;             // Loại giao dịch: Deposit, Withdraw, Transfer
    private double amount;           // Số tiền
    private LocalDateTime timestamp; // Thời gian giao dịch

    public Transaction(String transactionId,
                       Account account,
                       Employee employee,
                       String type,
                       double amount) {
        this.transactionId = transactionId;
        this.account = account;
        this.employee = employee;
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now(); // Lấy thời gian hiện tại, hoặc truyền từ ngoài
    }

    // Getter & Setter
    public String getTransactionId() {
        return transactionId;
    }

    public Account getAccount() {
        return account;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", account=" + (account != null ? account.getAccountNumber() : "N/A") +
                ", employee=" + (employee != null ? employee.getName() : "N/A") +
                ", timestamp=" + timestamp +
                '}';
    }
}

