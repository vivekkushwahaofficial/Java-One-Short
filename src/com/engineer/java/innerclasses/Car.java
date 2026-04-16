package com.engineer.java.innerclasses;

public class Car {
    public String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{
        void start(){
            if(!isEngineOn){
                System.out.println(model+" engine started.");
            }else{
                System.out.println(model+" engine is already on.");
            }
        }
        void stop(){
            if(!isEngineOn){
                System.out.println(model+ " engine stopped.");
            }else {
                System.out.println(model+" engine is already off.");
            }
        }
    }
}
