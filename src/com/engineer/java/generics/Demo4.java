package com.engineer.java.generics;

public class Demo4 {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(10, "Vivek");
        System.out.println(p1.first + ", " + p1.second);
    }

}
// generics

class Pair<T, U> {

    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
