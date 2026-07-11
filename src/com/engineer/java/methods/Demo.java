package com.engineer.java.methods;

public class Demo {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vivek";
        s1.age = 22;
        s1.rollNumber = 21;
        s1.college = "OIST";
        s1.markAttendence();
        s1.print();

    }
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence() {
        System.out.println("Attendence Marked " + name);
    }

    void print() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College    : " + college);
    }

}
