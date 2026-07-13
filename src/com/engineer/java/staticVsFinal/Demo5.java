package com.engineer.java.staticVsFinal;

public class Demo5 {

    public static void main(String[] args) {

        BankCustomer c1 = new BankCustomer("Vivek");
        BankCustomer c2 = new BankCustomer("Rahul");

        c1.display();
        c2.display();

        // Access without creating an object
        System.out.println("Minimum Balance = " + BankCustomer.MIN_BALANCE);
    }
}

class BankCustomer {

    // Shared by all customers and cannot be changed
    static final int MIN_BALANCE = 1000;

    String name;

    BankCustomer(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " must maintain ₹" + MIN_BALANCE);
    }
}

/*
Output

Vivek must maintain ₹1000
Rahul must maintain ₹1000
Minimum Balance = 1000
*/

/*
                    CLASS AREA
        +----------------------------------+
        | BankCustomer                     |
        |----------------------------------|
        | static final MIN_BALANCE = 1000  |
        +----------------------------------+
                    ▲
                    │ Shared by all objects
                    │
        ┌───────────┴────────────┐
        │                        │
        ▼                        ▼

             HEAP MEMORY
+--------------------+   +--------------------+
| BankCustomer       |   | BankCustomer       |
|--------------------|   |--------------------|
| name = "Vivek"     |   | name = "Rahul"     |
+--------------------+   +--------------------+
        ▲                         ▲
        │                         │
       c1                        c2

              STACK (main)
      +--------------------------+
      | c1 → Object1             |
      | c2 → Object2             |
      +--------------------------+
*/