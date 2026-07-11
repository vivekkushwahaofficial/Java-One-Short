package com.engineer.java.constructor;

public class Demo4 {

    public static void main(String[] args) {

        // Default constructor
        StudentConstructorOverloading s1 = new StudentConstructorOverloading();
        s1.display();

        // Constructor with one parameter
        StudentConstructorOverloading s2 = new StudentConstructorOverloading("Vivek");
        s2.display();

        // Constructor with two parameters
        StudentConstructorOverloading s3 = new StudentConstructorOverloading("Kajal", 20);
        s3.display();
    }
}

class StudentConstructorOverloading {

    String name;
    int age;

    // Default Constructor
    StudentConstructorOverloading() {
        System.out.println("Default Constructor Called");
    }

    // Constructor with one parameter
    StudentConstructorOverloading(String name) {
        this.name = name;
        System.out.println("One Parameter Constructor Called");
    }

    // Constructor with two parameters
    StudentConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Two Parameter Constructor Called");

    }

    // Display Method
    void display() {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }
}

/*
==========================
CONSTRUCTOR OVERLOADING
==========================

Definition:
Constructor overloading is the process of creating multiple
constructors in the same class with different parameter lists.

Purpose:
Used to initialize objects in different ways depending on the
available data.

Syntax:

Student() {

}

Student(String name) {

}

Student(String name, int age) {

}

Selection Rule:

Java selects the constructor based on:
✔ Number of parameters.
✔ Type of parameters.
✔ Order of parameters.

Execution:

new Student();
→ Student()

new Student("Vivek");
→ Student(String)

new Student("Vivek", 22);
→ Student(String, int)

Rules:
✔ Constructor name must be the same as the class name.
✔ Constructors must have different parameter lists.
✔ Return type is not allowed.
✔ Parameter names do not matter, only parameter types and order.

Interview Point:

Constructor Overloading:
- Multiple constructors in the same class.
- Different parameter lists.
- Java selects the appropriate constructor at compile time.

Important:
✔ Provides multiple ways to create objects.
✔ Improves code flexibility.
✔ It is an example of Compile-Time Polymorphism.
✔ Constructor overloading is different from constructor chaining.
*/