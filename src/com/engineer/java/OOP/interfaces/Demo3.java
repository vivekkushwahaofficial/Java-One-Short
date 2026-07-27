package com.engineer.java.OOP.interfaces;

public class Demo3 {

    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.send();
        email.log();
        Notification.company();

    }
}

interface Notification {

    void send();

    default void log() {
        System.out.println("Notification logged successfully.");
    }

    static void company() {
        System.out.println("OpenAI Notification Service.");
    }
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email Notification...");
    }

}

/*
# Demo 3 - Default & Static Methods in Interfaces

## Objective

Learn how Java 8 introduced **default methods** and **static methods** in interfaces to provide method implementations without breaking existing code.

---

## Concepts Covered

- Interface
- Abstract Method
- Default Method
- Static Method
- Method Overriding
- Backward Compatibility
- Java 8 Features

---

## Files

- Demo3.java

---

## Code Structure

Notification (Interface)
├── send()              → Abstract Method
├── log()               → Default Method
└── company()           → Static Method
        ▲
        │
EmailNotification

---

## Output

Sending Email Notification...
Notification logged successfully.
OpenAI Notification Service.

---

## Learning Outcome

After completing this demo, you will understand:

- How to declare a default method inside an interface.
- How to declare a static method inside an interface.
- Why Java 8 introduced default methods.
- How default methods help achieve backward compatibility.
- That static interface methods are called using the interface name.
- That a class may override a default method if it wants customized behavior.

---

## Real-World Examples

### Notification System
- Email Notification
- SMS Notification
- Push Notification

### Payment Gateway
- Default logging for all payment services.

### Spring Framework
- New methods can be added to interfaces without breaking existing implementations.

---

## Interview Takeaways

- Interfaces can contain abstract, default, and static methods.
- Default methods can be overridden.
- Static methods cannot be overridden.
- Static interface methods are invoked using the interface name.

Example:

```java
Notification.company();
```

---

## Key Points

- `default` allows an interface to provide a method implementation.
- `static` methods belong to the interface itself.
- Default methods support backward compatibility.
- Class methods always take priority over interface default methods.
 */
