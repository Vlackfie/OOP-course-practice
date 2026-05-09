
package com.mycompany.banking;

public class FixedDepositAccount extends Account {
    private int durationMonths;

  
    
    public FixedDepositAccount(int accNo, String holder, double balance, double rate, int durationMonths) {
        super(accNo, holder, balance, rate);
        this.durationMonths = durationMonths;
    }

    
    
    
    
    
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed before maturity!");
    }

    
    
    
    @Override
    public double calculateInterest() {
        return balance * interestRate * durationMonths / 12;
    }
}