package com.engineer.java.OOP.encapsulation;

public class Demo2 {

    public static void main(String[] args) {
        Order order = new Order(100);

        order.shipOrder();
        order.deliverOrder();

        order.cancelOrder();
        System.out.println("Final status: " + order.getStatus());

    }
}

class Order {

    private int orderId;
    private String status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = "PLACED";
    }

    public void shipOrder() {
        if (status.equals("PLACED")) {
            status = "SHIPPED";
            System.out.println("order shipped.");
        } else {
            System.out.println("order cannot be shipped.");
        }
    }

    public void deliverOrder() {
        if (status.equals("SHIPPED")) {
            status = "DELIVERED";
            System.out.println("order delivered.");
        } else {
            System.out.println("order can't be delivered.");
        }
    }

    public void cancelOrder() {
        if (status.equals("PLACED")) {
            status = "CANCELLED";
            System.out.println("order cancelled");
        } else {
            System.out.println("cannot cancel the order.");
        }
    }

    public String getStatus() {
        return status;
    }
}


/*
==================================================
Topic: Encapsulation in Java
Example: Order Management System
Author: Vivek Kumar
==================================================

Concept:
- The 'status' field is private, so it cannot be modified directly.
- State changes happen only through public methods.
- Business rules are enforced before changing the state.

Order State Flow:

PLACED
   |
shipOrder()
   |
SHIPPED
   |
deliverOrder()
   |
DELIVERED

Attempting to cancel after delivery is not allowed.

Output:
order shipped.
order delivered.
cannot cancel the order.
Final status: DELIVERED

Object Created
-------------------

+-----------------------+
| orderId = 100         |
| status = PLACED       |
+-----------------------+

        │
        │ shipOrder()
        ▼

+-----------------------+
| orderId = 100         |
| status = SHIPPED      |
+-----------------------+

        │
        │ deliverOrder()
        ▼

+-----------------------+
| orderId = 100         |
| status = DELIVERED    |
+-----------------------+

        │
        │ cancelOrder()
        ▼

Condition Failed

+-----------------------+
| orderId = 100         |
| status = DELIVERED    |
+-----------------------+


------Internal Flow of Method Calls--------

main()
   │
   ▼
new Order(100)
   │
   ▼
Constructor
   │
   ▼
status = PLACED
   │
   ▼
shipOrder()
   │
   ▼
status == PLACED ?
   │
   ├── Yes
   ▼
status = SHIPPED
   │
   ▼
deliverOrder()
   │
   ▼
status == SHIPPED ?
   │
   ├── Yes
   ▼
status = DELIVERED
   │
   ▼
cancelOrder()
   │
   ▼
status == PLACED ?
   │
   ├── No
   ▼
Print "cannot cancel the order."
   │
   ▼
getStatus()
   │
   ▼
Return DELIVERED
   │
   ▼
Print Final Status



# Java Encapsulation

## Definition
Encapsulation is the process of hiding an object's internal data and allowing access only through controlled methods.

## Example
Order Management System

## Features
- Private fields
- Constructor initialization
- Controlled state transitions
- Business rule validation

## State Flow

PLACED
   ↓
SHIPPED
   ↓
DELIVERED

Cannot cancel after delivery.

## Concepts Covered
- Classes & Objects
- Constructors
- Access Modifiers
- Encapsulation
- Business Logic
*/