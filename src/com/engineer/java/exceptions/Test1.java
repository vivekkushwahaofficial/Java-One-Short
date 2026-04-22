package com.engineer.java.exceptions;

public class Test1 {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }
        System.out.println("Good job :)");
    }

    public static int divide(int a, int b) {
        try {
            Student student = null;
            student.setId(123);
            System.out.println(student.getId());
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception :(");
            return -1;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        }
    }
}