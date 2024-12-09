package buoi6;
import java.util.Scanner;

public class Bai3_ATM {
    public static void main(String[] args) {
        // Initialize 10 accounts
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 0); // ID from 0-9, initial balance $100
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt for account ID
            int id = -1;
            while (id < 0 || id >= accounts.length) {
                System.out.print("Enter account ID (0-9): ");
                id = scanner.nextInt();
                if (id < 0 || id >= accounts.length) {
                    System.out.println("Invalid ID. Please try again.");
                }
            }

            Account currentAccount = accounts[id];
            boolean exit = false;

            while (!exit) {
                // Display menu
                System.out.println("\n===== MAIN MENU =====");
                System.out.println("1: View balance");
                System.out.println("2: Withdraw");
                System.out.println("3: Deposit");
                System.out.println("4: Exit");
                System.out.print("Your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // View balance
                        System.out.println("Current balance: $" + currentAccount.getBalance());
                        break;
                    case 2:
                        // Withdraw
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else if (withdrawAmount > currentAccount.getBalance()) {
                            System.out.println("Insufficient balance. Withdrawal failed.");
                        } else {
                            currentAccount.withdraw(withdrawAmount);
                            System.out.println("Withdrawal successful. New balance: $" + currentAccount.getBalance());
                        }
                        break;
                    case 3:
                        // Deposit
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount <= 0) {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        } else {
                            currentAccount.deposit(depositAmount);
                            System.out.println("Deposit successful. New balance: $" + currentAccount.getBalance());
                        }
                        break;
                    case 4:
                        // Exit
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}

