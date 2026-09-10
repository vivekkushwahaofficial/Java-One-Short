package com.engineer.java.io;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        String s = "";

        int c;

        // Read characters until the user presses Enter.
        while ((c = System.in.read()) != '\n') {

            // Convert the byte to a character and add it to the String.
            s += (char) c;
        }

        // Print the complete input.
        System.out.println(s);
    }
}