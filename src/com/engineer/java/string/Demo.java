package com.engineer.java.string;

public class Demo {
    public static void main(String[] args) {
        String s1 = "Vivek";  // Literals
        String s2 = "Vivek";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2));

        String s3 = new String("Hello");  //Using new operator
        String s4 = new String("Hello");

        System.out.println(s3 == s4);      // false
        System.out.println(s3.equals(s4));  //True
    }
}
