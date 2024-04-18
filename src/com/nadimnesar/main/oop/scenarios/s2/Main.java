package com.nadimnesar.main.oop.scenarios.s2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);
        System.out.println("Current balance: $" + account.getBalance());
    }
}