package com.engineer.java.nestedClass;

public class Demo {

    public static void main(String[] args) {
        // Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        inner.fun();

        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.computeInterest(400));
    }
}
// Static Nested Class

class Outer {

    //static int x;

    static class Inner {

        void fun() {
            System.out.println("Inner Class Calling");
        }
    }
}

class BankAccount {
    private static class InterestCalculator {
        static double calculateYearly(double principle, double rate){
            return principle * rate;
        }
    }

    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal, 0.09);
    }
}

/* 
STATIC NESTED CLASS
===================

Definition:
A class declared inside another class using `static`.

Syntax:
class Outer {
    static class Inner {
    }
}

Object creation:
Outer.Inner obj = new Outer.Inner();

Key Points:
• Does NOT require an Outer class object.
• Can be used like a normal class.
• Can directly access static members of Outer.
• Can access non-static members through an Outer object.
• Can be private, public, protected, or default.
• Useful for logical grouping and helper classes.

Common Uses:
1. Helper class
2. Builder Design Pattern
3. Utility/static functionality
4. Request/Response DTOs

Example:
BankAccount
    ↓
private static InterestCalculator
    ↓
Used internally by BankAccount

Remember:
static nested class → No Outer object required
non-static Outer member → Need Outer object
private nested class → Accessible only inside Outer class
*/