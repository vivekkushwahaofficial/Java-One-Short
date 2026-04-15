package com.engineer.java.method;

public class MethodArgs {
    public static void main(String[] args){
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(new int[]{1,2}));
    }
    public static int sum(int...  a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }
}
