package com.engineer.java.OOP.abstraction;

public class Demo {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.brake();
        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.brake();

    }
}

abstract class Vehicle {

    abstract void start();

    void brake() {
        System.out.println("Brake applied.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts using a push button.");
    }

}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts using kick-start.");
    }

}


/*
Output

Car starts using a push button.
Brake applied.

Bike starts using kick-start.
Brake applied.

Internal JVM View

               Vehicle
            (Abstract Class)
             /           \
            /             \
         Car             Bike
          |                |
     start()          start()
          \              /
           \            /
        brake() inherited
        
        
        
        */