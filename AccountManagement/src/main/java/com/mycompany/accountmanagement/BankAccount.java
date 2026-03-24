/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.accountmanagement;
/**
 *
 * @author vlackfie
 */

public class BankAccount extends Account{
    String BankName, routingNum, branchName;
    
    public BankAccount(String BankName, String routingNum, String branchName, String name, String id, String address, double balance) {
        super(name, id, address, balance);
        this.BankName = BankName;
        this.routingNum = routingNum;
        this.branchName = branchName;
    }
    
   public void withdraw(double amount){
       super.withdraw(amount+10);
   }
   public void transfer(Account Recipient, double amount){
       super.transfer(Recipient, amount+10);
       Recipient.setBalance(Recipient.getBalance()-10);
     
   }
           
    public void deposite(double amount){
        
    }
}
