package com.engineer.java.OOP.encapsulation;

public class Demo {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(-500);
        ba.withdraw(300);
        System.out.println(ba.getBalance());
    }
}

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
