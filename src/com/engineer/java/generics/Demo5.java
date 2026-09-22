package com.engineer.java.generics;

public class Demo5 {

    public static void main(String[] args) {
        Integer y = getResult(6);
        System.out.println(y);

        printPair(12, "Vivek");  // Type inference
    }

    public static <T> T getResult(T x) {  // <T> Type parameter
        return x;
    }

    public static <T, U> void printPair(T first, U second) {
        System.out.println(first + ", " + second);
    }

}

// Generic Methods
// <T> returnType methodName(T parameter){
// }
