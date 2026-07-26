package com.engineer.java.OOP.abstraction;

public class Demo2 {

    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.processPayment(500);
        creditCardPayment.generateReceipt();

        System.out.println();

        UpiPayment upiPayment = new UpiPayment();
        upiPayment.processPayment(5000);
        upiPayment.generateReceipt();
    }
}

abstract class PaymentService {

    abstract void processPayment(double amount);

    void generateReceipt() {
        System.out.println("Receipt generated.");
    }
}

class CreditCardPayment extends PaymentService {

    @Override
    void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Credit Card.");
    }
}

class UpiPayment extends PaymentService {

    @Override
    void processPayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using UPI.");
    }
}

/*
===========================================
Java OOP - Abstraction (Payment System)
===========================================

Objective:
- Learn Abstraction using an abstract class and abstract methods.
- Define common behavior in the parent class.
- Force child classes to provide their own implementation.

Concepts Covered:
1. Abstract Class
   - PaymentService is an abstract class.
   - It cannot be instantiated.

2. Abstract Method
   - processPayment(double amount) has no implementation.
   - Every payment type must implement it.

3. Concrete Method
   - generateReceipt() is implemented once in the parent class.
   - It is inherited by all child classes.

4. Method Overriding
   - CreditCardPayment and UpiPayment provide their own
     implementation of processPayment().

Flow:
PaymentService (Abstract)
        ▲
   ┌────┴────┐
   │         │
CreditCard  UPI
Payment     Payment

Learning Outcome:
- Understand how abstraction hides implementation details.
- Learn code reuse through inheritance.
- Prepare for runtime polymorphism using a parent reference
  (PaymentService payment = new CreditCardPayment();), which
  will be covered in the next demo.

===========================================
*/