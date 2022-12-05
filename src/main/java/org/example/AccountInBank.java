package org.example;

import java.util.Scanner;

public class AccountInBank {
    public int acc_no;
    public String name;
    public float amount;

    public void insert(int account, String n, float amt) {
        acc_no = account;
        name = n;
        amount = amt;
    }

    public void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + " Deposited");
    }

    public void withdraw(float amt) {
        if(amount <amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdraw.");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    // display
    public void display() {
        System.out.println("Account::: " + acc_no + "Name::: " + name + " Amount ::: " + amount);
    }


    public static void main(String[] args) {
        AccountInBank myAccount = new AccountInBank();
        myAccount.insert(1,"MVDZO", 500000.99f);
        myAccount.checkBalance();
        myAccount.withdraw(9999999999f);
    }

}
