

package com.mycompany.banking;

public class Banking {
    public static void main(String[] args) {

        Account[] accounts = new Account[3];

        accounts[0] = new SavingsAccount(101, "Noha", 10000, 0.05, 500);
        accounts[1] = new CheckingAccount(102, "Maisha", 8000, 0.03, 50);
        accounts[2] = new FixedDepositAccount(103, "Nafisa", 20000, 0.07, 12);

        for (Account acc : accounts) {
            acc.displayInfo();

            acc.deposit(1000);
            acc.withdraw(2000);

            System.out.println("Interest: " + acc.calculateInterest());
        }
    }
}



