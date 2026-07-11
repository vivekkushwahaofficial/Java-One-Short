package com.engineer.java.constructor;

public class Demo3 {

    public static void main(String[] args) {

        StudentParameterized s1 = new StudentParameterized("Vivek", 22, "OIST", true,7.17);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.college);
        System.out.println(s1.isPresent);
        System.out.println(s1.marks);

         StudentParameterized s2 = new StudentParameterized("Kajal", 20, "OIST", true,7.8);

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.college);
        System.out.println(s2.isPresent);
        System.out.println(s2.marks);


    }
}

class StudentParameterized {

    String name;
    int age;
    String college;
    boolean isPresent;
    double marks;

    // Parameterized Constructor

    StudentParameterized(String name, int age, String college, boolean isPresent, double marks) {
        this.name = name;
        this.age = age;
        this.college = college;
        this.isPresent = isPresent;
        this.marks = marks;
    }
}

/*
==========================
PARAMETERIZED CONSTRUCTOR
==========================

Definition:
A constructor that accepts one or more parameters to initialize object data.

Purpose:
Used to initialize objects with different values during object creation.

Syntax:

ClassName(type parameter1, type parameter2) {

}

Important:
✔ Accepts parameters.
✔ Initializes object with user-provided values.
✔ Eliminates the need to assign values separately.
✔ Can be overloaded.
 */