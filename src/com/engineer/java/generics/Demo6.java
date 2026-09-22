package com.engineer.java.generics;

public class Demo6 {

    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>();
    }
}
// Generics --> T can be anything
// Bounds in Generics
// Upper bound --> T is atleast Number or its subType
  
class Box<T> {

    T value;

    public void printDouble() {
        System.out.println(value);
    }
}
