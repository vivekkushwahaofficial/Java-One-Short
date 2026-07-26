package com.engineer.java.OOP.abstraction;

public class Demo3 {

    public static void main(String[] args) {
        AuthProvider auth = new JWTAuth();
        auth.authentication();

        System.out.println();

        // AuthProvider authProvider = new OAuthAuth();
        // authProvider.authentication();
        auth = new OAuthAuth();
        auth.authentication();

    }
}

abstract class AuthProvider {

    abstract void authentication();

}

class JWTAuth extends AuthProvider {

    @Override
    void authentication() {
        System.out.println("User authenticated using JWT.");
    }

}

class OAuthAuth extends AuthProvider {

    @Override
    void authentication() {
        System.out.println("User authenticated using OAuth.");
    }

}

/*
===========================================
Demo 3 - Abstraction with Runtime Polymorphism
===========================================

Objective:
- Use an abstract class as a reference type.
- Store different child objects in the same parent reference.
- Understand runtime polymorphism through dynamic method dispatch.
- Learn how Spring Boot achieves loose coupling using abstraction.

Concepts Covered:
1. Abstract Class
2. Method Overriding
3. Upcasting (Parent Reference → Child Object)
4. Runtime Polymorphism
5. Dynamic Method Dispatch

Flow:
AuthProvider auth = new JWTAuth();
        ↓
JWT authentication() executes

auth = new OAuthAuth();
        ↓
OAuth authentication() executes

Learning Outcome:
- A parent reference can refer to different child objects.
- The JVM calls the correct overridden method at runtime.
- This design promotes flexibility, extensibility, and loose coupling in enterprise applications.
===========================================
 */