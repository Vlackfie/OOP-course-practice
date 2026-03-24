/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountmanagement;

/**
 *
 * @author vlackfie
 */
public class AccountManagement {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("NRB","886","jaf","Sadi","001","Jaf", 5000);
        BankAccount b2 = new BankAccount("NRB","886","jaf","Miss Marvel","001","Jaf", 100000);
        b1.withdraw(5000);
        b1.transfer(b2,900);
    }
}
