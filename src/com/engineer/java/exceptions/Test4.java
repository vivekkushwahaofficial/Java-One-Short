package com.engineer.java.exceptions;

public class Test4 {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount(6000);
        try {
             bankAccount.withdraw(5000);
        }catch (InsufficientFundsException e){
            System.out.println(e);

        }
    }
}
