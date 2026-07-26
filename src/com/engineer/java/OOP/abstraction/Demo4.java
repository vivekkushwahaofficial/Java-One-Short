package com.engineer.java.OOP.abstraction;

public class Demo4 {

    public static void main(String[] args) {
        System.out.println();

        Employee employee = new SoftwareEngineer(101, "Google");
        employee.showCompany();
        employee.attendance();
        employee.calculateSalary();
        Employee.companyPolicy();

        System.out.println();

        employee = new Manager(201, "Microsoft");
        employee.showCompany();
        employee.attendance();
        employee.calculateSalary();
        Employee.companyPolicy();
    }
}

abstract class Employee {

    int employeeId;
    String companyName;

    public Employee(int employeeId, String companyName) {
        this.employeeId = employeeId;
        this.companyName = companyName;
    }

    void showCompany() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Company Name: " + companyName);
    }

    static void companyPolicy() {
        System.out.println("Follow the company policies.");
    }

    final void attendance() {
        System.out.println("Attendance marked.");
    }

    abstract void calculateSalary();
}

class SoftwareEngineer extends Employee {

    public SoftwareEngineer(int employeeId, String companyName) {
        super(employeeId, companyName);
    }

    @Override
    void calculateSalary() {
        System.out.println("Engineer salary calculated.");
    }
}

class Manager extends Employee {

    public Manager(int employeeId, String companyName) {
        super(employeeId, companyName);
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager salary calculated.");
    }
}


/*
===========================================
       Output
===========================================

Employee ID : 101
Company Name: Google
Attendance marked.
Engineer salary calculated.
Follow the company policies.

Employee ID : 201
Company Name: Microsoft
Attendance marked.
Manager salary calculated.
Follow the company policies.


===========================================
Demo 4 - Features of an Abstract Class
===========================================

Objective:
- Demonstrate all important features of an abstract class.

Concepts Covered:
- Abstract Class
- Abstract Method
- Constructor
- Instance Variables
- Concrete Method
- Static Method
- Final Method
- Method Overriding
- Runtime Polymorphism
- Parent Reference with Child Object

Learning Outcome:
- Understand that abstract classes can contain constructors, variables,
  concrete methods, static methods, and final methods.
- Learn that child classes must implement abstract methods.
- Understand how runtime polymorphism works with abstract classes.
===========================================
 */