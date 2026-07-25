package com.engineer.java.OOP.inheritance;

public class Demo4 {

    public static void main(String[] args) {
        // Parent reference pointing to a CreditCard object
        Payment creditCardPayment = new CreditCard(100);
        creditCardPayment.pay();

       // Parent reference pointing to a UPI object
        Payment upiPayment = new UPI(101);
        upiPayment.pay();
    }
}

class Payment {

    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void pay() {
        System.out.println("Processing generic payment of Rs. " + amount);

    }
}

class CreditCard extends Payment {

    CreditCard(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Processing credit card payment of Rs. " + amount);
    }
}

class UPI extends Payment {

    UPI(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("Processing UPI Payment of Rs. " + amount);
    }
}
