package com.engineer.java.interfaces;

public class Demo6 {

    public static void main(String[] args) {
        D d = new D();
        d.fun();

    }
}
/* 
interface A {
    void fun();
}

interface B extends A {

}

interface C extends A {

}

class D implements B, C {
    @Override 
    public void fun() {
        System.out.println("Default Implementation");
    }
}
 */

interface A {
    void fun();
}

interface B extends A {
    default void fun(){
        System.out.println("B");
    }
}

interface C extends A {
    default void fun(){
        System.out.println("C");
    }
}

class D implements B, C {
    @Override 
    public void fun() {
        System.out.println("Override Own Implementation");
    }
}

class E implements B, C{
    @Override
    public void fun(){
        B.super.fun();
        C.super.fun();
    }
}


/*
A → Declares fun()

B → Inherits A and provides default fun()

C → Inherits A and provides default fun()

D → Implements B & C
    → Conflict between B and C
    → Resolves it by overriding fun()

E → Implements B & C
    → Resolves conflict by explicitly calling
      B.super.fun() and C.super.fun()
 */
