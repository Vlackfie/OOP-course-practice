
package com.mycompany.banking;

abstract class Account {
    private int accountNumber;
    private String accountHolder;
    protected double balance;
    protected double interestRate;

    public Account(int accountNumber, String accountHolder, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // Getters
    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    // Deposit with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw (basic version, can be overridden)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }

    // Abstract method → must override
    public abstract double calculateInterest();

    // Common display method
    public void displayInfo() {
        System.out.println("\nAccount No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}