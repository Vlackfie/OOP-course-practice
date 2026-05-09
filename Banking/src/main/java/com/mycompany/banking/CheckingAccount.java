
package com.mycompany.banking;

public class CheckingAccount extends Account {
    private double transactionFee;

    public CheckingAccount(int accNo, String holder, double balance, double rate, double fee) {
        super(accNo, holder, balance, rate);
        this.transactionFee = fee;
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + transactionFee;

        if (total <= balance) {
            balance -= total;
        } else {
            System.out.println("Insufficient balance including fee!");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}