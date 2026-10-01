package com.engineer.java.collections.comparator;

/*
 * ============================================================
 * COMPARATOR + LAMBDA - QUICK REVISION NOTES
 * ============================================================
 *
 * Comparator:
 * - Used for custom sorting of objects.
 * - Main method: compare(T o1, T o2)
 *
 * compare() return value:
 * - Negative -> first object comes before second
 * - 0        -> both objects are equal for sorting
 * - Positive -> first object comes after second
 *
 * Lambda:
 * - Short way to implement a Functional Interface.
 * - Comparator is a Functional Interface.
 *
 * Lambda Syntax:
 * (parameters) -> expression
 *
 * Example:
 * (s1, s2) -> s1.rollNo - s2.rollNo
 *
 * Anonymous Class:
 * new Comparator<Student>() {
 *     public int compare(Student s1, Student s2) {
 *         return s1.rollNo - s2.rollNo;
 *     }
 * }
 *
 * Lambda replaces the above boilerplate code.
 *
 * Sorting can be based on:
 * - Name
 * - Roll Number
 * - Marks
 * ============================================================
 */
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Vivek", 101, 85));
        list.add(new Student("Aditya", 102, 99));
        list.add(new Student("Rohit", 103, 93));
        list.add(new Student("Sonu", 104, 98));

        // Comparator<Student> c1 = new SortByName();
        // Comparator<Student> c2 = new SortByMarks();
        // Comparator<Student> c3 = new SortByRollNo();
        // Anonymous class
        // Collections.sort(list, new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         return s1.marks - s2.marks;
        //     }
        // });
        // Lambda Expression
        Collections.sort(list, (s1, s2) -> s1.rollNo - s2.rollNo);

        for (Student s : list) {
            System.out.println(s.name + " , " + s.rollNo + " , " + s.marks);
        }
    }
}

// class SortByName implements Comparator<Student> {
//
//     @Override
//     public int compare(Student s1, Student s2) {
//         return s1.name.compareTo(s2.name);
//     }
// }
// class SortByRollNo implements Comparator<Student> {
//
//     @Override
//     public int compare(Student s1, Student s2) {
//         return s1.rollNo - s2.rollNo;
//     }
// }
// class SortByMarks implements Comparator<Student> {
//
//     @Override
//     public int compare(Student s1, Student s2) {
//     return s1.marks - s2.marks;
//     }
// }
class Student {

    String name;
    int rollNo;
    int marks;

    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}
