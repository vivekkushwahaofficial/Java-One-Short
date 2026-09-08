package com.engineer.java.nestedClass;
// Anonymous Class

public class Demo4 {

    public static void main(String[] args) {
        // Persion p1 = new Persion();
        // p1.introduce();
        // Persion p2 = new Guest();
        // p2.introduce();

        Persion p2 = new Persion() {

            String name = "Vivek";
            @Override
            void introduce() {
                greet();
                System.out.println("Hi, I am a Guest");
                System.out.println("Hi, I am "+ name);
            }
            void greet(){
                System.out.println("Hello");
            }
        };
        p2.introduce();
    }
}

class Persion {

    void introduce() {
        System.out.println("Hi, I am a person");
    }
}

// class Guest extends Persion {
//     @Override
//     void introduce() {
//          System.out.println("Hi, I am a Guest");
//     }
// }


/*
ANONYMOUS CLASS
===============

Definition:
An unnamed class created and used at the same time.

Syntax:
Person p = new Person() {
    @Override
    void introduce() {
        System.out.println("Hello");
    }
};

Key Points:
• Has no class name.
• Used mainly for one-time implementation.
• Can extend a class or implement an interface.
• Can override parent methods.
• Can have its own fields and methods.
• Created using the new keyword.

Example:
Person p = new Person() {
    String name = "Vivek";

    @Override
    void introduce() {
        greet();
        System.out.println("Hi, I am " + name);
    }

    void greet() {
        System.out.println("Hello");
    }
};

Common Use:
• Event handling
• One-time behavior
• Implementing interfaces
• Quick method overriding

Remember:
Normal Class → Has a name
Anonymous Class → No name

*/