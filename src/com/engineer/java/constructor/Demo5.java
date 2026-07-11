package com.engineer.java.constructor;

public class Demo5 {

    public static void main(String[] args) {
      System.out.println("========== Student 1 ==========");
        StudentChaining s1 = new StudentChaining();
        s1.display();

        System.out.println("========== Student 2 ==========");
        StudentChaining s2 = new StudentChaining("Vivek");
        s2.display();

        System.out.println("========== Student 3 ==========");
        StudentChaining s3 = new StudentChaining("Vivek", 22);
        s3.display();

        System.out.println("========== Student 4 ==========");
        StudentChaining s4 = new StudentChaining("Vivek", 22, "OIST");
        s4.display();

    }

}

class StudentChaining {

    String name;
    int age;
    String college;

    StudentChaining() {
        System.out.println("Default");
    }

    StudentChaining(String name) {
        this();
        this.name = name;
        System.out.println("One Parameter");
    }

    StudentChaining(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Two Parameter");
    }

    StudentChaining(String name, int age, String college) {
        this(name, age);
        this.college = college;
        System.out.println("Three Chaining");
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
        System.out.println();
    }
}

/*
==========================
CONSTRUCTOR CHAINING
==========================

Definition:
Constructor chaining is the process of calling one constructor
from another constructor of the same class using this().

Purpose:
Used to reuse constructor code and avoid duplicate initialization.

Syntax:

Student() {

}

Student(String name) {
    this();
}

Student(String name, int age) {
    this(name);
}

Student(String name, int age, String college) {
    this(name, age);
}

Execution Flow:

new Student("Vivek", 22, "OIST");

Selection:
Student(String, int, String)

Execution:
Student()
   ↑
Student(String)
   ↑
Student(String, int)
   ↑
Student(String, int, String)

Rules:
✔ this() calls another constructor of the same class.
✔ this() must be the first statement inside a constructor.
✔ Only one this() call is allowed inside a constructor.
✔ Constructor chaining works only when multiple constructors exist.

Interview Point:

Constructor Overloading:
- Multiple constructors with different parameter lists.

Constructor Chaining:
- One constructor calls another constructor using this().

Important:
✔ Reduces duplicate code.
✔ Improves code readability.
✔ Improves maintainability.
✔ Commonly used in real-world Java applications.
*/
