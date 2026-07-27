package com.engineer.java.OOP.interfaces;

public class Demo2 {

    public static void main(String[] args) {
      
        Smartphone phone = new Smartphone();
        phone.makeCall();
        phone.clickPicture();
        phone.playMusic();
        System.out.println("----------- Interface References -----------");

        Callable caller = new Smartphone();
        caller.makeCall();

        Camera camera = new Smartphone();
        camera.clickPicture();

        MusicPlayer player = new Smartphone();
        player.playMusic();
    }
}

interface Callable {

    void makeCall();
}

interface Camera {

    void clickPicture();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Callable, Camera, MusicPlayer {

    @Override
    public void makeCall() {
        System.out.println("Calling...");
    }

    @Override
    public void clickPicture() {
        System.out.println("Taking Photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

}

/*
# Demo 2 - Multiple Interface Implementation

## Objective
Learn how a class can implement multiple interfaces in Java.

## Concepts Covered
- Multiple Interfaces
- implements Keyword
- Method Overriding
- Multiple Inheritance through Interfaces
- Interface Contract

## Files
- Demo2.java

## Output

Calling...
Taking Photo...
Playing Music...

## Learning Outcome
- Understand that a class can implement multiple interfaces.
- Learn how Java achieves multiple inheritance using interfaces.
- Understand that one class can provide implementations for methods from multiple interfaces.

## Real World Examples
- Smartphone (Calling, Camera, Music Player)
- Multi-function Printer (Print, Scan, Copy)
- Smart TV (Display, Internet, Bluetooth)
 */
