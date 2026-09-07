package com.engineer.java.nestedClass;

// Local classes
public class Demo3 {

    public static void main(String[] args) {

        // Create Outer2 object.
        Outer2 outer = new Outer2();

        // Call greet() method.
        outer.greet();
    }
}

class Outer2 {

    private int x = 4;

    void greet() {

        // Local variable.
        // It is not changed, so it is effectively final.
        int number = 10;

        // Local class.
        class Local {

            void sayHello() {

                System.out.println("Hello");

                // Access Outer2 instance variable.
                System.out.println(x);

                // Access effectively final local variable.
                System.out.println(number);
            }
        }

        // Create Local class object.
        Local local = new Local();

        // Call Local class method.
        local.sayHello();
    }
}

/*
LOCAL CLASS
===========

Definition:
A class declared inside a method, constructor, or block.

Example:

void greet() {

    // Effectively final local variable
    int number = 10;

    class Local {

        void sayHello() {
            System.out.println(number);
        }
    }
}

Key Points:

• Scope is limited to the block where it is declared.

• Can access members of the enclosing class.

• Can access final or effectively final local variables.

• Can be declared inside:

    1. Method
    2. Constructor
    3. if block
    4. Loop
    5. Static/instance initializer block

Effective Final:

• A local variable that is assigned once and not changed afterward.

• It does not need the `final` keyword.

Example:

int number = 10; // Effectively final

Local Class can access `number`.

If `number` is changed later, it is no longer effectively final.

Important:

Local classes are mainly used when a class is needed
only inside a particular method or block.


===================
Your Program Flow
===================

main()
   ↓
new Outer2()
   ↓
outer.greet()
   ↓
Local class
   ↓
new Local()
   ↓
local.sayHello()
   ↓
Hello
4
10
*/