
package BaiKiemTraCuoiModule2.services;

import BaiKiemTraCuoiModule2.models.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
    private List<Account> accounts;

    public AccountManager() {
        this.accounts = new ArrayList<>();
    }

    // Thêm tài khoản
    public void addAccount(Account account) throws Exception {
        // Kiểm tra trùng số tài khoản
        Account existing = findByAccountNumber(account.getAccountNumber());
        if (existing != null) {
            throw new Exception("Số tài khoản đã tồn tại: " + account.getAccountNumber());
        }
        accounts.add(account);
    }

    // Sửa thông tin tài khoản (chủ yếu sửa tên chủ tài khoản, vì accountNumber không được phép sửa)
    public void updateAccountHolder(String accountNumber, String newHolder) throws Exception {
        Account account = findByAccountNumber(accountNumber);
        if (account == null) {
            throw new Exception("Không tìm thấy tài khoản: " + accountNumber);
        }
        account.setAccountHolder(newHolder);
    }

    // Xóa tài khoản
    public void deleteAccount(String accountNumber) throws Exception {
        Account account = findByAccountNumber(accountNumber);
        if (account == null) {
            throw new Exception("Không tìm thấy tài khoản: " + accountNumber);
        }
        // Kiểm tra số dư
        if (account.getBalance() > 0) {
            throw new Exception("Không thể xóa tài khoản " + accountNumber
                    + " vì tài khoản còn số dư " + account.getBalance());
        }
        // Kiểm tra nếu có lịch sử giao dịch?
        // Tùy yêu cầu, ví dụ nếu có transaction, không cho xóa hoặc yêu cầu xử lý trước
        if (!account.getTransactionList().isEmpty()) {
            throw new Exception("Tài khoản có lịch sử giao dịch. Không thể xóa hoặc cần xác nhận hủy giao dịch trước.");
        }

        accounts.remove(account);
    }

    // Tìm kiếm tài khoản theo accountNumber
    public Account findByAccountNumber(String accountNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber().equals(accountNumber)) {
                return a;
            }
        }
        return null;
    }

    // Tìm kiếm tài khoản theo tên chủ tài khoản
    public List<Account> findByAccountHolder(String accountHolder) {
        List<Account> result = new ArrayList<>();
        for (Account a : accounts) {
            if (a.getAccountHolder().equalsIgnoreCase(accountHolder)) {
                result.add(a);
            }
        }
        return result;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}

