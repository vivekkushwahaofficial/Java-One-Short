package com.engineer.java.OOP.polymorphism;

public class Demo4 {

    public static void main(String[] args) {
        Employee employee = new Developer();
        employee.work();

        Employee employee1 = new Tester();
        employee1.work();

    }
}

class Employee {

    void login() {
        System.out.println("Employee Login");
    }

    void work() {
        System.out.println("Employee work");
    }
}

class Developer extends Employee {

    @Override
    void work() {
        System.out.println("Developer writes code.");
    }
}

class Tester extends Employee {

    @Override
    void work() {
        System.out.println("Tester tests the application.");
    }
}
