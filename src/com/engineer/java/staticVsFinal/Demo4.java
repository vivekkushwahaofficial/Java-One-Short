package com.engineer.java.staticVsFinal;

public class Demo4 {

    public static void main(String[] args) {
        System.out.println("Main Method");
        final float PI = 3.14f;
        System.out.println(PI);

        Calculator c = new Calculator();
        System.out.println(c.PI);
    }
}

class Calculator {

    final double PI = 3.14;

    public Calculator() {
        System.out.println("Calculator Object Created");
    }

}


/*
Output
Main Method
3.14
Calculator Object Created
3.14
 */