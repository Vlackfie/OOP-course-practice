
package com.mycompany.banking;

public class SavingsAccount extends Account {
    private double minimumBalance;

    public SavingsAccount(int accNo, String holder, double balance, double rate, double minBalance) {
        super(accNo, holder, balance, rate);
        this.minimumBalance = minBalance;
    }

    
    
    
    
@Override
    public void withdraw(double amount) {
    if (balance - amount >= minimumBalance) {
            balance -= amount;
 } else {
            System.out.println("Below minimum balance!");
 }
    }

    
    
    
    
    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}