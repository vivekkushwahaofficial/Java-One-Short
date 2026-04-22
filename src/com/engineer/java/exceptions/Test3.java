package com.engineer.java.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test3 {
    public static void main(String[] args) {
    try {
        method2();
    }catch(Exception e){
        System.out.println(e);
    }
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }

    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("a.txt");
    }
}
