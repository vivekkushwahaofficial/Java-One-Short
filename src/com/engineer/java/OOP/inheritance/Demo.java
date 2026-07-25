package com.engineer.java.OOP.inheritance;

public class Demo {

    public static void main(String[] args) {

        EngineeringStudent1 student = new EngineeringStudent1();
        student.name = "Vivek Kumar";
        student.age = 22;

        student.displayStudent1Info();
        student.markAttendance();
        student.attendLab();

        System.out.println();

        CSEEngineeringStudent1 cse = new CSEEngineeringStudent1();
        cse.name = "Rahul Kumar";
        cse.age = 21;

        cse.displayStudent1Info();
        cse.markAttendance();
        cse.attendLab();
        cse.attendCSELab();
    }
}

class Student1 {

    protected String name;
    protected int age;

    void markAttendance() {
        System.out.println("Attendance marked.");
    }
}

class EngineeringStudent1 extends Student1 {

    void displayStudent1Info() {
        System.out.println("Student1 Name : " + name);
        System.out.println("Student1 Age  : " + age);
    }

    void attendLab() {
        System.out.println("Engineering Lab attended.");
    }
}

class CSEEngineeringStudent1 extends EngineeringStudent1 {

    void attendCSELab() {
        System.out.println("CSE lab attended");
    }
}

/*
# Java Inheritance

## Definition
Inheritance allows one class to acquire the properties and methods of another class using the `extends` keyword.

## Types
- Single Inheritance
- Multilevel Inheritance
- Hierarchical Inheritance

## Real-world Example
University Management System

## Class Diagram
(Person → Student1 → EngineeringStudent1 → CSEEngineeringStudent1)

## Output
Student1 Name : Vivek Kumar
Student1 Age  : 22
Lab attended.

## Why use inheritance?

- Code reuse
- Less duplication
- Better maintainability
- Represents an IS-A relationship

*/
