/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountmanagement;

/**
 *
 * @author vlackfie
 */
public class Account {
    private String name, id, address;
   private  double balance;

    public Account(String name, String id, String address, double balance) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.balance = balance;
    }
    
    public void deposite(double amount){
        if (amount >=1){
            balance += amount;
            
        }else 
        {System.out.println("invalid balance");
        
        }
            
    }
 public void withdraw(double amount){
     if (balance >= amount){
         balance-=amount;
         System.out.println("Withdraw"+amount+"Current balance:"+balance);
                 
     }
     else {
         System.out.println("LOW BALANCE ");
     }
     
 }
 
 public void transfer(Account Recipient, double amount){
     if (balance >= amount){
         Recipient.balance+=amount;
         balance -= amount;
         System.out.println("Sent " + amount + " Successfully to:" + Recipient.getName()  + " Current balance:"+ balance );
     }
     else {
         System.out.println("Invalid");
     }
 }
         
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
}
