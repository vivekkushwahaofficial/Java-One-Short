package com.engineer.java.staticVsFinal;

public class Demo3 {

    public static void main(String[] args) {
        Student2 s1 = new Student2("Vivek", 22);
        Student2 s2 = new Student2("Raj", 23);

        System.out.println(s1.name + " " + s1.age + " " + " " + Student2.college + " " + Student2.grade);
        System.out.println(s2.name + " " + s2.age + " " + " " + Student2.college + " " + s2.grade);
    }
}

class Student2 {

    String name;
    int age;
    static String college;
    static int grade;

    Student2(String name, int age) {
        System.out.println("Constructor");
        this.name = name;
        this.age = age;
    }

    // Static block
    static {
        System.out.println("Static Block");
        college = "OIST";
        grade = 8;
    }
}

