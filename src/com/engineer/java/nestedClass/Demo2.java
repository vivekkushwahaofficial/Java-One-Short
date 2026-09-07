package com.engineer.java.nestedClass;

public class Demo2 {

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner inner = outer.new Inner();

        // Outer1.Inner inner = new Outer().new Inner();
        inner.fun();

        // inner.fun2();
        Outer1.Inner.fun2();
    }
}

class Outer1 {

    int x = 10;

    class Inner {

        int x = 20;

        void fun() {
            System.out.println("Inner Class Called");
            System.out.println(x);
            System.out.println(Outer1.this.x);
        }

        static void fun2() {
            System.out.println("Static method called");
        }
    }
}

/*
NON-STATIC INNER CLASS
======================

Definition:
A class declared inside another class WITHOUT `static`.

Example:
class Outer {
    class Inner {
    }
}

Object creation:
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();

Key Points:
• Requires an Outer object.
• Inner object is associated with an Outer object.
• Can directly access Outer instance members.
• `this` → current Inner object.
• `Outer.this` → current Outer object.
• Can have static members in modern Java (JDK 16+).

Example:
Outer.x = 10
Inner.x = 20

x
→ Inner.x → 20

Outer.this.x
→ Outer.x → 10

Static member:
static int y = 30;

Static method:
static void fun2() { }

Can call:
Outer.Inner.fun2();


============================
🧠 Remember the difference
============================

STATIC NESTED CLASS
        ↓
Outer.Inner obj = new Outer.Inner();
        ↓
No Outer object needed


NON-STATIC INNER CLASS
        ↓
Outer outer = new Outer();
Outer.Inner obj = outer.new Inner();
        ↓
Outer object required
*/