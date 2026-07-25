package com.engineer.java.OOP.inheritance;

public class Demo5 {

    public static void main(String[] args) {
        Payment1 payment = new CreditCard1(100);
        payment.pay();

        Payment1 payment1 = new UPI(101);
        payment1.pay();
    }
}
