package com.engineer.java.OOP.inheritance;

public class Demo2 {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.markAttendance();

        System.out.println();

        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        System.out.println();

        CSEEngineeringStudent ces = new CSEEngineeringStudent();
        ces.markAttendance();
        ces.attendLab();
        ces.attendCSELab();
    }
}

class Student {

    protected String name;
    protected int age;

    void markAttendance() {
        System.out.println("Attendance marked.");
    }
}

class EngineeringStudent extends Student {

    void attendLab() {
        System.out.println("Lab attended");
    }
}

class CSEEngineeringStudent extends EngineeringStudent {

    void attendCSELab() {
        System.out.println("CSE lab attended");
    }
}
