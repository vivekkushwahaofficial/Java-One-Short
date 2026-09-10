package com.engineer.java.objectClass.immutableClass;

public class Demo2 {

    public static void main(String[] args) {

        College1 college = new College1("OIST", "Bhopal");

        Student1 s1 = new Student1(22, "Vivek", college);
        System.out.println(college.name); // OIST

        s1.getCollege().name = "OIST Bhopal";
        System.out.println(s1.getCollege().name); // OIST Bhopal
    }
}
// Not purely immutable

final class Student1 {

    private final int age;
    private final String name;
    private final College1 college;

    public Student1(int age, String name, College1 college) {
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

    public College1 getCollege() {
        return college;
    }
}
// Mutable

class College1 {

    String name;
    String address;

    College1(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
