package com.engineer.java.exceptions;

public class Test2 {
    public static void main(String[] args) {
        try{
            level3();
        }catch (Exception e){
            System.out.println(e);
            return;
        }
    }

    public static void level3(){
        int[] array = new int[5];
        array[5] = 10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level1();
    }
}
