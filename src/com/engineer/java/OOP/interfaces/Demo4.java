package com.engineer.java.OOP.interfaces;

public class Demo4 {

    public static void main(String[] args) {
        Child child = new Child();
        child.greet();
        child.say();
    }
}

interface Father {

    void say();

    default void greet() {
        System.out.println("Study hard.");
    }
}

interface Mother {

    void say();

    default void greet() {
        System.out.println("Take care of your health.");
    }
}

class Child implements Father, Mother {

    @Override
    public void greet() {
        Father.super.greet();
        Mother.super.greet();
    }

    @Override
    public void say() {
        System.out.println("Wake up at 6 AM.");
    }
}

/*
# Demo 4 - Diamond Problem & Conflict Resolution

## Objective

Learn how Java resolves the Diamond Problem when a class implements multiple interfaces containing the same default method.

---

## Concepts Covered

- Multiple Interface Implementation
- Default Methods
- Diamond Problem
- Method Conflict
- Method Overriding
- InterfaceName.super.method()

---

## Files

- Demo4.java

---

## Code Structure

            Father
        default greet()
              ▲
              │
            Child
              │
              ▼
        default greet()
            Mother

---

## Output

Study hard.
Take care of your health.
Wake up at 6 AM.

---

## Learning Outcome

- Understand the Diamond Problem.
- Learn why Java cannot automatically choose between two default methods.
- Learn how to override the conflicting method.
- Learn how to invoke a specific interface's default method using `InterfaceName.super.method()`.

---

## Real-World Examples

- Multiple payment providers with common default behavior.
- Multiple logging interfaces.
- Multiple notification services.

---

## Interview Takeaways

- Diamond Problem occurs only with default methods.
- The implementing class must override the conflicting method.
- Use `InterfaceName.super.methodName()` to invoke a specific interface's default method.
*/