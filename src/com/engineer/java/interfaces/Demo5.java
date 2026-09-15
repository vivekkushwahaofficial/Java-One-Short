package com.engineer.java.interfaces;

public class Demo5 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
  
}

interface Vehicle{
    default void drive(){
        System.out.println("Vehicle is Driving");
    }
}

class Car implements Vehicle{
    // @Override 
    // public void drive(){
    //     System.out.println("Car is Driving");
    // }
}
