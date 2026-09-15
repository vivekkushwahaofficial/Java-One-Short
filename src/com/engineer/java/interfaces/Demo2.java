package com.engineer.java.interfaces;

public class Demo2 {
    public static void main(String[] args) {
        // MathConstant m = new Random();
        // m.joy();

        System.out.println(MathConstant.PI_VALUE);
    } 
}

// Variable inside interface

interface MathConstant{
    double PI_VALUE = 3.14;
    // void joy();
}

class Random implements MathConstant{
    // @Override 
    // public void joy(){
    //     System.out.println(PI_VALUE);
    // }
}
