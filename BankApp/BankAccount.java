package BankApp;

public class BankAccount {

    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit_amount(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid amount:");
        }
    }

    public void withdraw_amount(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal done. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    public void check_balance() {
        System.out.println("Your current balance is: " + balance);
    }
}