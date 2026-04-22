package com.engineer.java.multithreading;

public class World extends Thread{
    @Override
    public void run() {
        System.out.println("World!");
        System.out.println(Thread.currentThread().getName());
    }
}
