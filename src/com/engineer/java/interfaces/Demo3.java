package com.engineer.java.interfaces;

public class Demo3 {

    public static void main(String[] args) {

        Z z = new Z();

        z.fun();    // Calling fun() from interface A
        z.fun2();   // Calling fun2() from interface B
    }
}

// Multiple Inheritance --> Interfaces
interface X {

    void fun();
}

interface Y {

    void fun2();
}

class Z implements X, Y {

    @Override
    public void fun() {
        System.out.println("fun()");
    }

    @Override
    public void fun2() {
        System.out.println("fun2()");
    }
}
