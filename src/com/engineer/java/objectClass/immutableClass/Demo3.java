package com.engineer.java.objectClass.immutableClass;

public class Demo3 {

    public static void main(String[] args) {
        College1 college = new College1("OIST", "Bhopal");

        Student2 s1 = new Student2(22, "Vivek", college);
        System.out.println(college.name); // OIST

        s1.getCollege().name = "OIST Bhopal";
        System.out.println(s1.getCollege().name); //OIST
    }
}
// Immutable
//Defensive copy of college(non primitive)

final class Student2 {

    private final int age;
    private final String name;
    private final College1 college;

    public Student2(int age, String name, College1 college) {
        this.age = age;
        this.name = name;
        this.college = new College1(college.name, college.address);
    }

    //getter
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public College1 getCollege() {
        return new College1(this.college.name, this.college.address);
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
