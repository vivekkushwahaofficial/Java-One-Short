package com.engineer.java.generics.wildcards;

public class Demo5 {

    public static void main(String[] args) {
        Box<String> b1 = new Box();
    }
    public static <T> void fun(T a, T b){

    }
}

class Box<T> {

    T value;
}

//<T> and <?>
//super and extends
