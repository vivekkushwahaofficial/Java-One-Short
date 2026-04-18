package com.engineer.java.interfaces.animals;

public interface Animal {

    int MAX_AGE = 150;
    public abstract void eat();

    void sleep();

    public static void info() {
        System.out.println("This is an Animal interface.");
    }
        public default void run(){
            System.out.println("Animal is running.");

    }
}
