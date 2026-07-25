package com.engineer.java.OOP.inheritance;

public class Demo6 {

    public static void main(String[] args) {

        Employee developer = new Developer("Vivek");
        developer.login();
        developer.work();

        Employee manager = new Manager("Rahul");
        manager.login();
        manager.work();
    }
}

class Employee {

    protected String name;

    Employee(String name) {
        this.name = name;
    }

    final void login() {
        System.out.println(name + "logged into the system.");
    }

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {

    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing Java code.");
    }

    // ❌ This is not allowed
    // @Override
    // void login() {
    //     System.out.println("Developer login");
    // }
}

class Manager extends Employee {

    Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}


/*
Final Keyword in Inheritance

## 📖 Overview

This demo demonstrates how the `final` keyword works with inheritance in Java.

It explains:

- Final Method
- Method Overriding
- Runtime Polymorphism
- Why a final method cannot be overridden

---

## 🎯 Learning Objectives

After completing this demo, you will understand:

- How to declare a final method.
- Why final methods cannot be overridden.
- How child classes can still access final methods.
- How runtime polymorphism works with inherited methods.

---

## 🏗 Class Hierarchy

```
            Employee
           /        \
     Developer    Manager
```

- `Employee` is the parent class.
- `Developer` and `Manager` inherit from `Employee`.

---

## 💡 Concepts Covered

### 1. Inheritance

`Developer` and `Manager` inherit the properties and methods of `Employee`.

```java
class Developer extends Employee
```

---

### 2. Method Overriding

Both child classes override the `work()` method.

```java
@Override
void work() {
    System.out.println(name + " is writing Java code.");
}
```

---

### 3. Runtime Polymorphism

```java
Employee developer = new Developer("Vivek");
```

Although the reference type is `Employee`, the JVM executes the overridden method of the actual object (`Developer`).

---

### 4. Final Method

```java
final void login() {
    System.out.println(name + " logged into the system.");
}
```

The `login()` method is marked as `final`, so it **cannot be overridden** by child classes.

---

## 🚫 Invalid Code

The following code will produce a compilation error.

```java
@Override
void login() {
    System.out.println("Developer login");
}
```

Compiler Error:

```
Cannot override the final method from Employee
```

---

## ▶ Expected Output

```
Vivek logged into the system.
Vivek is writing Java code.
Rahul logged into the system.
Rahul is managing the team.
```

---

## 📌 Key Takeaways

- `final` methods can be inherited.
- `final` methods cannot be overridden.
- Runtime polymorphism works only with methods that are not `final`.
- Child classes can call a final method but cannot modify its implementation.

---

## 🧠 Interview Questions

### Q1. What is a final method?

A final method is a method that cannot be overridden by subclasses.

---

### Q2. Why do we use final methods?

To protect important business logic from being modified by child classes.

---

### Q3. Can a child class call a final method?

**Yes.**

A child class inherits and can use a final method but cannot override it.

---

### Q4. Does final affect method overloading?

**No.**

It only prevents method overriding.

---

## 🎓 Conclusion

This demo shows how the `final` keyword helps protect critical methods while still allowing inheritance and runtime polymorphism for other methods.
*/