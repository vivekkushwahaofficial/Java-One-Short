package com.engineer.java.staticVsFinal;

class Demo {

    public static void main(String[] args) {
        Student s1 = new Student("Vivek", 22);
        Student s2 = new Student("Raj", 23);
        Student.college = "OIST";

        System.out.println(s1.name + " " + s1.age + " " + " " + Student.college);
        System.out.println(s2.name + " " + s2.age + " " + " " + Student.college);
    }
}

class Student {

    String name;
    int age;
    static String college;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
