package com.engineer.java.io;
import java.io.IOException;
public class Demo {

    public static void main(String[] args) throws IOException {
        int x = System.in.read();
        System.err.println(x);
        System.out.println((char)x);

    }
}

// A --> 65 --> Binary form of 65
