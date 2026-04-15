package com.engineer.java.method;

public class IsBoolean {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrime(15));
        System.out.println(isPrime(3));
    }

    public static boolean isPrime(int x) {
        int res = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                res++;
            }
        }
        return res == 2;
    }
}
