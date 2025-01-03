
package BaiKiemTraCuoiModule2;

import BaiKiemTraCuoiModule2.models.*;
import BaiKiemTraCuoiModule2.services.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static AccountManager accountManager = new AccountManager();
    private static EmployeeManager employeeManager = new EmployeeManager();
    private static TransactionManager transactionManager = new TransactionManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Tạo sẵn một vài Employee để test
        try {
            Employee e1 = new Teller("E001", "Alice", 10000);
            Employee e2 = new Teller("E002", "Bob", 12000);
            employeeManager.addEmployee(e1);
            employeeManager.addEmployee(e2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1.1":
                    addNewAccount();
                    break;
                case "1.2":
                    updateAccount();
                    break;
                case "1.3":
                    deleteAccount();
                    break;
                case "1.4":
                    searchAccount();
                    break;
                case "2.1":
                    deposit();
                    break;
                case "2.2":
                    withdraw();
                    break;
                case "2.3":
                    transfer();
                    break;
                case "3.1":
                    showAccountTransactions();
                    break;
                case "3.2":
                    showAllTransactions();
                    break;
                case "4.1":
                    addNewEmployee();
                    break;
                case "4.2":
                    showAllEmployees();
                    break;
                case "4.3":
                    assignAccountToEmployee();
                    break;
                case "5.1":
                    System.out.println("Hệ thống đã thoát. Cảm ơn bạn đã sử dụng!");
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // In menu
    private static void printMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Quản lý tài khoản:");
        System.out.println("   1.1. Thêm tài khoản mới");
        System.out.println("   1.2. Sửa thông tin tài khoản");
        System.out.println("   1.3. Xóa tài khoản");
        System.out.println("   1.4. Tìm kiếm tài khoản");
        System.out.println("2. Giao dịch tài khoản:");
        System.out.println("   2.1. Nạp tiền vào tài khoản");
        System.out.println("   2.2. Rút tiền từ tài khoản");
        System.out.println("   2.3. Chuyển khoản giữa hai tài khoản");
        System.out.println("3. Quản lý giao dịch:");
        System.out.println("   3.1. Hiển thị lịch sử giao dịch của một tài khoản");
        System.out.println("   3.2. Hiển thị toàn bộ giao dịch trong hệ thống");
        System.out.println("4. Quản lý nhân viên:");
        System.out.println("   4.1. Thêm nhân viên mới");
        System.out.println("   4.2. Xem danh sách nhân viên");
        System.out.println("   4.3. Gán tài khoản cho nhân viên");
        System.out.println("5. Thoát chương trình:");
        System.out.println("   5.1. Thoát khỏi hệ thống");
        System.out.print("Lựa chọn: ");
    }

    // 1.1: Thêm tài khoản
    private static void addNewAccount() {
        try {
            System.out.print("Nhập số tài khoản: ");
            String accNumber = scanner.nextLine();
            System.out.print("Nhập tên chủ tài khoản: ");
            String holder = scanner.nextLine();
            System.out.print("Nhập số dư ban đầu: ");
            double balance = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập ID nhân viên phụ trách: ");
            String empId = scanner.nextLine();
            Employee e = employeeManager.findById(empId);
            if (e == null) {
                System.out.println("Không tìm thấy nhân viên với ID: " + empId);
                return;
            }
            // Tạo account
            Account acc = new Account(accNumber, holder, balance, e);
            // Thêm account vào AccountManager
            accountManager.addAccount(acc);
            // Gán account cho employee
            employeeManager.assignAccountToEmployee(e, acc);

            System.out.println("Tài khoản được thêm thành công!");
            System.out.println("Số tài khoản: " + acc.getAccountNumber());
            System.out.println("Tên chủ tài khoản: " + acc.getAccountHolder());
            System.out.println("Số dư ban đầu: " + acc.getBalance());
            System.out.println("Nhân viên phụ trách: " + e.getName());
        } catch (Exception ex) {
            System.out.println("Lỗi khi thêm tài khoản: " + ex.getMessage());
        }
    }

    // 1.2: Sửa thông tin tài khoản
    private static void updateAccount() {
        try {
            System.out.print("Nhập số tài khoản cần sửa: ");
            String accNumber = scanner.nextLine();
            System.out.print("Nhập tên chủ tài khoản mới: ");
            String newHolder = scanner.nextLine();
            accountManager.updateAccountHolder(accNumber, newHolder);
            System.out.println("Tài khoản được cập nhật thành công!");
            System.out.println("Số tài khoản: " + accNumber);
            System.out.println("Tên chủ tài khoản mới: " + newHolder);
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 1.3: Xóa tài khoản
    private static void deleteAccount() {
        try {
            System.out.print("Nhập số tài khoản cần xóa: ");
            String accNumber = scanner.nextLine();
            accountManager.deleteAccount(accNumber);
            System.out.println("Tài khoản " + accNumber + " đã được xóa thành công!");
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 1.4: Tìm kiếm tài khoản
    private static void searchAccount() {
        System.out.print("Nhập số tài khoản (nhấn Enter bỏ qua) hoặc tên chủ tài khoản: ");
        String input = scanner.nextLine();
        // Thử tìm theo accountNumber trước
        Account a = accountManager.findByAccountNumber(input);
        if (a != null) {
            System.out.println("Tìm thấy tài khoản:");
            System.out.println("Số tài khoản: " + a.getAccountNumber());
            System.out.println("Tên chủ tài khoản: " + a.getAccountHolder());
            System.out.println("Số dư hiện tại: " + a.getBalance());
            System.out.println("Nhân viên phụ trách: " + (a.getEmployeeInCharge() != null ? a.getEmployeeInCharge().getName() : "N/A"));
        } else {
            // Tìm theo tên
            List<Account> list = accountManager.findByAccountHolder(input);
            if (list.isEmpty()) {
                System.out.println("Không tìm thấy tài khoản phù hợp.");
            } else {
                System.out.println("Các tài khoản trùng tên chủ tài khoản:");
                for (Account acc : list) {
                    System.out.println(acc);
                }
            }
        }
    }

    // 2.1: Nạp tiền
    private static void deposit() {
        try {
            System.out.print("Nhập số tài khoản: ");
            String accNumber = scanner.nextLine();
            Account account = accountManager.findByAccountNumber(accNumber);
            if (account == null) {
                System.out.println("Không tìm thấy tài khoản: " + accNumber);
                return;
            }
            System.out.print("Nhập ID nhân viên thực hiện: ");
            String empId = scanner.nextLine();
            Employee e = employeeManager.findById(empId);
            if (e == null) {
                System.out.println("Không tìm thấy nhân viên: " + empId);
                return;
            }
            System.out.print("Nhập số tiền nạp: ");
            double amount = Double.parseDouble(scanner.nextLine());
            transactionManager.deposit(account, e, amount);

            System.out.println("Nạp tiền thành công!");
            System.out.println("Số tài khoản: " + account.getAccountNumber());
            System.out.println("Số tiền nạp: " + amount);
            System.out.println("Số dư mới: " + account.getBalance());
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 2.2: Rút tiền
    private static void withdraw() {
        try {
            System.out.print("Nhập số tài khoản: ");
            String accNumber = scanner.nextLine();
            Account account = accountManager.findByAccountNumber(accNumber);
            if (account == null) {
                System.out.println("Không tìm thấy tài khoản: " + accNumber);
                return;
            }
            System.out.print("Nhập ID nhân viên thực hiện: ");
            String empId = scanner.nextLine();
            Employee e = employeeManager.findById(empId);
            if (e == null) {
                System.out.println("Không tìm thấy nhân viên: " + empId);
                return;
            }
            System.out.print("Nhập số tiền rút: ");
            double amount = Double.parseDouble(scanner.nextLine());
            transactionManager.withdraw(account, e, amount);

            System.out.println("Rút tiền thành công!");
            System.out.println("Số tài khoản: " + account.getAccountNumber());
            System.out.println("Số tiền rút: " + amount);
            System.out.println("Số dư mới: " + account.getBalance());
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 2.3: Chuyển khoản
    private static void transfer() {
        try {
            System.out.print("Nhập số tài khoản gửi: ");
            String senderNum = scanner.nextLine();
            Account sender = accountManager.findByAccountNumber(senderNum);

            System.out.print("Nhập số tài khoản nhận: ");
            String receiverNum = scanner.nextLine();
            Account receiver = accountManager.findByAccountNumber(receiverNum);

            System.out.print("Nhập ID nhân viên thực hiện: ");
            String empId = scanner.nextLine();
            Employee e = employeeManager.findById(empId);

            if (sender == null || receiver == null || e == null) {
                System.out.println("Không tìm thấy tài khoản gửi/nhận hoặc nhân viên thực hiện!");
                return;
            }

            System.out.print("Nhập số tiền chuyển: ");
            double amount = Double.parseDouble(scanner.nextLine());

            transactionManager.transfer(sender, receiver, e, amount);

            System.out.println("Chuyển khoản thành công!");
            System.out.println("Tài khoản gửi: " + senderNum);
            System.out.println("Tài khoản nhận: " + receiverNum);
            System.out.println("Số tiền chuyển: " + amount);
            System.out.println("Số dư mới tài khoản gửi: " + sender.getBalance());
            System.out.println("Số dư mới tài khoản nhận: " + receiver.getBalance());
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 3.1: Hiển thị lịch sử giao dịch của một tài khoản
    private static void showAccountTransactions() {
        System.out.print("Nhập số tài khoản: ");
        String accNumber = scanner.nextLine();
        Account account = accountManager.findByAccountNumber(accNumber);
        if (account == null) {
            System.out.println("Không tìm thấy tài khoản: " + accNumber);
            return;
        }
        // Lấy lịch sử
        List<Transaction> txList = transactionManager.getTransactionsByAccount(account);
        if (txList.isEmpty()) {
            System.out.println("Không có giao dịch nào cho tài khoản này.");
        } else {
            System.out.println("Lịch sử giao dịch cho tài khoản " + accNumber + ":");
            for (Transaction tx : txList) {
                System.out.println(tx);
            }
        }
    }

    // 3.2: Hiển thị toàn bộ giao dịch
    private static void showAllTransactions() {
        List<Transaction> txList = transactionManager.getAllTransactions();
        if (txList.isEmpty()) {
            System.out.println("Không có giao dịch nào trong hệ thống.");
        } else {
            System.out.println("Danh sách toàn bộ giao dịch:");
            for (Transaction tx : txList) {
                System.out.println(tx);
            }
        }
    }

    // 4.1: Thêm nhân viên mới
    private static void addNewEmployee() {
        try {
            System.out.print("Nhập ID nhân viên: ");
            String id = scanner.nextLine();
            System.out.print("Nhập tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập lương cơ bản: ");
            double salary = Double.parseDouble(scanner.nextLine());

            // Ở đây tạm thêm nhân viên vào dạng Teller
            // Nếu bạn muốn nhập vai trò (Teller hay Manager) thì có thể hỏi thêm
            Employee e = new Teller(id, name, salary);
            employeeManager.addEmployee(e);

            System.out.println("Nhân viên được thêm thành công!");
            System.out.println("ID: " + e.getId());
            System.out.println("Tên: " + e.getName());
            System.out.println("Lương cơ bản: " + e.getSalary());
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    // 4.2: Xem danh sách nhân viên
    private static void showAllEmployees() {
        List<Employee> list = employeeManager.getAllEmployees();
        if (list.isEmpty()) {
            System.out.println("Không có nhân viên trong hệ thống.");
        } else {
            // Có thể sắp xếp list trước khi in
            System.out.println("Danh sách nhân viên:");
            for (Employee e : list) {
                System.out.println("ID: " + e.getId() +
                        ", Tên: " + e.getName() +
                        ", Lương: " + e.getSalary() +
                        ", Tài khoản quản lý: " + e.getManagedAccounts().size());
            }
        }
    }

    // 4.3: Gán tài khoản cho nhân viên
    private static void assignAccountToEmployee() {
        try {
            System.out.print("Nhập ID nhân viên: ");
            String empId = scanner.nextLine();
            Employee e = employeeManager.findById(empId);
            if (e == null) {
                System.out.println("Không tìm thấy nhân viên: " + empId);
                return;
            }
            System.out.print("Nhập số tài khoản: ");
            String accNumber = scanner.nextLine();
            Account account = accountManager.findByAccountNumber(accNumber);
            if (account == null) {
                System.out.println("Không tìm thấy tài khoản: " + accNumber);
                return;
            }

            employeeManager.assignAccountToEmployee(e, account);
            System.out.println("Tài khoản " + accNumber + " đã được gán thành công cho nhân viên " + empId);
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}

