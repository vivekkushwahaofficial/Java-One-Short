package com.engineer.java.exceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount == balance){
            balance = 0;
            System.out.println("Account emptied");
            return;
        }
        if(amount > balance){
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
    }

}
