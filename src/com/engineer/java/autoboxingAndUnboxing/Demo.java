package com.engineer.java.autoboxingAndUnboxing;

public class Demo {
  public static void main(String[] args) {
    //Autoboxing :- Automatically converting a primitive value into its corresponding wrapper-class object.
    // int x = 10;
    // // Integer y = x;
    // Integer y = Integer.valueOf(x);

    // System.out.println(x);
    // System.out.println(y);    //unboxing

    // //Unboxing :- Automatically converting a wrapper-class object into its corresponding primitive value.
    // Integer a = new Integer(20);
    // // Integer a = Integer.valueOf(20);
    // int b = a;  

    // System.out.println(a);
    // System.out.println(b);

    // // 1.Assignments
    // printInteger(40);

    // // 2.Method calls
    // Integer x = 50;
    // printInteger(x);

    // // 3.Arithmetic operations
    // Integer a = 10;
    // Integer b = 20;

    // int sum = a + b;
    // System.out.println(sum);

    Integer x = null;
    int y = x;
  }
  static void printInteger(int x){
    System.out.println(x);
  }
}

/*
Primitive ↔ Wrapper Mapping

This is important for interviews:

byte     → Byte
short    → Short
int      → Integer
long     → Long
float    → Float
double   → Double
char     → Character
boolean  → Boolean

*/