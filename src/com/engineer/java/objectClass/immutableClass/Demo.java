package com.engineer.java.objectClass.immutableClass;
// Immutable

public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student(22, "Vivek", "OIST");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege());
        College college = new College("OIST", "Bhopal");
        System.out.println(college.name);
    }
}

final class Student {

    private final int age;
    private final String name;
    private final String college;

    public Student(int age, String name, String college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    //getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }
}
// Mutable
class College {

    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}


/*
IMMUTABLE CLASS — QUICK REVISION

Definition:
An immutable class is a class whose object state cannot be changed after creation.

Rules:
1. Make the class final → prevents inheritance.
2. Make fields private final.
3. Initialize fields through the constructor.
4. Don't provide setter methods.
5. Provide getters for reading values.
6. For mutable objects like List, use defensive copying.

Basic Structure:

final class Student {

    private final int age;
    private final String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

Remember:

final class
     +
private final fields
     +
constructor initialization
     +
no setters
     ↓
Immutable Class

Example:
String is immutable.

Interview Line:
"An immutable object cannot change its state after it has been created."
*/
