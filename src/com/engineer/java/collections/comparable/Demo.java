package com.engineer.java.collections.comparable;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Vivek", 70));
        list.add(new Student("Aditya", 85));
        list.add(new Student("Rohan", 95));
        list.add(new Student("Ashu", 85));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.name + " , " + s.marks);
        }
    }
}

class Student implements Comparable<Student> {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // @Override
    // public int compareTo(Student other) {
    //     return other.marks - this.marks;
    // }
    @Override
    public int compareTo(Student otherStudent) {
        if (this.marks != otherStudent.marks) {
            return this.marks - otherStudent.marks;
        }
        return this.name.compareTo(otherStudent.name);
    }
}

/*
this.marks - other.marks
< 0 : this.marks, other.marks
> 0 : other.marks, this.marks

 */
