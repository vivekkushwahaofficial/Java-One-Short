package com.engineer.java.staticVsFinal;

public class Demo2 {

    public static void main(String[] args) {
        Student1 s1 = new Student1("Vivek", 22);
        Student1 s2 = new Student1("Raj", 23);

        System.out.println(s1.name + " " + s1.age + " " + " " + Student1.college);
        System.out.println(s2.name + " " + s2.age + " " + " " + Student1.college);
    }
}

class Student1 {

    String name;
    int age;
    static String college = "OIST";

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
