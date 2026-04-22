package com.engineer.java.multithreading;

public class Test {
    public static void main(String[] args) {
        World world = new World();
        System.out.print("Hello ");
        world.run();
        System.out.println(Thread.currentThread().getName());

    }
}
