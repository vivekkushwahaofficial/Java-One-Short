package com.engineer.java.string;

public class Demo4 {

    public static void main(String[] args) {
        String s1 = new String();

        // String
        String s2 = new String("Hello");

        String s3 = "Vivek";
        String s4 = new String(s3);
        // char array
        char[] arr = {'V', 'i', 'v', 'e', 'k', ' ', 'K', 'u', 'm', 'a', 'r'};
        String s5 = new String(arr);
        //arr[0] = 'B';
        // System.out.println(s5);

        // char array subset
        String s6 = new String(arr, 0, 6);
        // System.out.println(s6);

        // byte array
        byte[] arr2 = {97, 98, 99};
        String s7 = new String(arr2, 0 , 2);
        // System.out.println(s7);

        // StringBuilder / StringBuffer
        StringBuilder sb = new StringBuilder("Vivek");
        String s9 = new String(sb);

        // System.out.println(s9);

         StringBuffer sbb = new StringBuffer("Kumar");
        String s10 = new String(sbb);

        System.out.println(s10);
    }
}
