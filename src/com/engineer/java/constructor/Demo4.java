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
