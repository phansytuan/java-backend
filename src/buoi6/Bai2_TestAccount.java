package buoi6;

import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // Default constructor
    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = new Date();
    }

    // Parameterized constructor
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Method to get monthly interest amount
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
}

// Test program
public class Bai2_TestAccount {
    public static void main(String[] args) {
        // Create an account with ID: 1122, balance: $20,000, annualInterestRate: 4.5%
        Account account = new Account(1122, 20000, 4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print account details
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}

