
package BaiKiemTraCuoiModule2.services;

import BaiKiemTraCuoiModule2.models.Account;
import BaiKiemTraCuoiModule2.models.Employee;
import BaiKiemTraCuoiModule2.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        this.transactions = new ArrayList<>();
    }

    // Nạp tiền
    public Transaction deposit(Account account, Employee employee, double amount) throws Exception {
        if (account == null) {
            throw new Exception("Tài khoản không tồn tại để nạp tiền.");
        }
        // Gọi hàm deposit ở account
        account.deposit(amount);
        // Tạo transaction
        Transaction transaction = new Transaction(
                generateTransactionId(),
                account,
                employee,
                "Deposit",
                amount
        );
        // Lưu transaction vào list
        transactions.add(transaction);
        // Gắn transaction vào account
        account.addTransaction(transaction);
        return transaction;
    }

    // Rút tiền
    public Transaction withdraw(Account account, Employee employee, double amount) throws Exception {
        if (account == null) {
            throw new Exception("Tài khoản không tồn tại để rút tiền.");
        }
        account.withdraw(amount);
        Transaction transaction = new Transaction(
                generateTransactionId(),
                account,
                employee,
                "Withdraw",
                amount
        );
        transactions.add(transaction);
        account.addTransaction(transaction);
        return transaction;
    }

    // Chuyển khoản
    public List<Transaction> transfer(Account sender, Account receiver, Employee employee, double amount) throws Exception {
        if (sender == null || receiver == null) {
            throw new Exception("Một trong hai tài khoản không tồn tại.");
        }
        if (amount <= 0) {
            throw new Exception("Số tiền chuyển phải > 0");
        }
        if (sender.getBalance() < amount) {
            throw new Exception("Số dư không đủ để chuyển khoản.");
        }

        // Thực hiện
        sender.withdraw(amount);
        receiver.deposit(amount);

        // Tạo transaction cho tài khoản gửi
        Transaction senderTx = new Transaction(generateTransactionId(), sender, employee, "Transfer-Out", amount);
        transactions.add(senderTx);
        sender.addTransaction(senderTx);

        // Tạo transaction cho tài khoản nhận
        Transaction receiverTx = new Transaction(generateTransactionId(), receiver, employee, "Transfer-In", amount);
        transactions.add(receiverTx);
        receiver.addTransaction(receiverTx);

        List<Transaction> result = new ArrayList<>();
        result.add(senderTx);
        result.add(receiverTx);
        return result;
    }

    // Lấy toàn bộ giao dịch
    public List<Transaction> getAllTransactions() {
        // Có thể sắp xếp theo timestamp mới nhất lên đầu
        // Ở đây minh họa sắp xếp giảm dần:
        List<Transaction> sorted = new ArrayList<>(transactions);
        sorted.sort((t1, t2) -> t2.getTimestamp().compareTo(t1.getTimestamp()));
        return sorted;
    }

    // Lấy lịch sử giao dịch của một tài khoản
    public List<Transaction> getTransactionsByAccount(Account account) {
        // Ở đây ta có thể trả về danh sách transactionList bên trong account
        // Hoặc lọc từ transactions. Để chắc chắn, ta lọc từ transactions
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getAccount().getAccountNumber().equals(account.getAccountNumber())) {
                result.add(t);
            }
        }
        // Sắp xếp giảm dần theo thời gian
        result.sort((t1, t2) -> t2.getTimestamp().compareTo(t1.getTimestamp()));
        return result;
    }

    // Giả lập gen transactionId
    private String generateTransactionId() {
        return "T" + (transactions.size() + 1);
    }
}

