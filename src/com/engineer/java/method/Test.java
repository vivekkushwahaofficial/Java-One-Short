package com.engineer.java.method;

public class Test {
    public static void main(String[] args) {
        int y = 10;
        int z = multiplyby10(y);
        System.out.println(z);
    }
        private static int multiplyby10(int x) {
        return x * 10;
        }
}
