package com.engineer.java.OOP.polymorphism;

public class Demo {

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        ac.area(3);
        ac.area(3, 4);
        ac.area(3, 3.14);

    }
}

class AreaCalculator {

    void area(int a) {
        int square = a * a;
        System.out.println(square);
    }

    void area(int a, int b) {
        int rectangle = a * b;
        System.out.println(rectangle);
    }

    void area(int a, double pi) {
        double circle = pi * a * a;
        System.out.println(circle);
    }
}
