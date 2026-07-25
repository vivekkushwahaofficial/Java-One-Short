package com.engineer.java.OOP.inheritance;

public class Demo3 {

    public static void main(String[] args) {

        EngineeringStudent2 student =
                new EngineeringStudent2("Vivek Kumar", 22);

        student.displayStudent2Info();
        student.markAttendance();
    }
}

class Student2 {

    protected String name;
    protected int age;

    Student2(String name, int age){
      this.name = name;
      this.age = age;
    }

    void markAttendance() {
        System.out.println("Attendance marked.");
    }
}

class EngineeringStudent2 extends Student2 {

    EngineeringStudent2(String name, int age) {

        super(name, age);

        System.out.println("EngineeringStudent object Created");
    }

    void displayStudent2Info() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}


/*

----Output-----
EngineeringStudent object Created
Name : Vivek Kumar
Age  : 22
Attendance marked.



Q1. Why is super() used?

Answer:

super() is used to invoke the constructor of the parent class. It ensures that the parent part of the object is initialized before the child class initializes its own members.

Q2. Can super() appear anywhere inside a constructor?

Answer:

No. It must be the first statement in the constructor.

Q3. What happens if you don't write super()?
If the parent has a default constructor, Java inserts super() automatically.
If the parent has only parameterized constructors, you must call the appropriate super(...) explicitly, otherwise the code will not compile.*/
