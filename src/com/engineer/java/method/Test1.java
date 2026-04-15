package com.engineer.java.method;

public class Test1 {
    public static void main(String[] args){
        int n = 31;
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i<= Math.sqrt(num); i++) {   //i<= Math.sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
