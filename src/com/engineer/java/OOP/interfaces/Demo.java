package com.engineer.java.OOP.interfaces;

public class Demo {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
    }
}

interface Animal {

    void makeSound();
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

/*
# Demo 1 - Introduction to Interfaces

## Objective
Learn the basics of Java Interfaces.

## Concepts Covered
- Interface
- Abstract Method
- implements Keyword
- Method Overriding
- Runtime Polymorphism
- Parent Reference with Child Object

## Files
- Demo.java

## Output

Dog is barking.
Cat is meowing.

## Learning Outcome
- Understand what an interface is.
- Learn how classes implement an interface.
- Understand that an interface defines a contract.
- Learn runtime polymorphism using an interface reference.

## Real World Examples
- Payment Gateway (UPI, Credit Card, PayPal)
- Notification Service (Email, SMS, Push Notification)
- Database Drivers (MySQL, PostgreSQL, Oracle)

*/