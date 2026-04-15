package com.engineer.java.recursion;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumbers(10));
    }
    public static int sumOfNNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNNaturalNumbers(n-1);
    }
}
