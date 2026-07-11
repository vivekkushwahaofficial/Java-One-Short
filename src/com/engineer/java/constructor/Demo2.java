package com.engineer.java.constructor;

public class Demo2 {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.college);
        System.out.println(s1.isPresent);
        System.out.println(s1.marks);

    }
}

class Student {

    String name;
    int age;
    String college;
    boolean isPresent;
    double marks;

    Student() {
        // name = "Vivek";
        // age = 22;
        // college = "OIST";
        // isPresent = true;
        // marks = 7.17;
 
        // We can also write...
        this.name = "Vivek";
        this.age = 22;
        this.college = "OIST";
        this.isPresent = true;
        this.marks = 7.17;
    }
}

/*
Output

Vivek
22
OIST
true
7.17
 */

 /* 
--- RULES OF CONSTRUCTOR ---

1. Constructor name must be the same as the class name.
2. A constructor has no return type (not even void).
3. It is called automatically when an object is created.
4. It is used to initialize object data.
5. A class can have multiple constructors (Constructor Overloading).

==========================
USER-DEFINED CONSTRUCTOR
==========================

Definition:
A constructor written by the programmer to initialize object data.

Purpose:
Used to assign custom values when an object is created.

Syntax:
ClassName() {
    // initialization
}

Important:
✔ Java will NOT generate a default constructor.
✔ It is automatically called when an object is created.
 */
