package com.engineer.java.interfaces.devices;

import com.engineer.java.innerclasses.Payment;

public class SmartPhone implements Camera, MusicPlayer, Phone {

    @Override
    public void takePhoto() {
        System.out.println("Take photo from smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video from smartphone");

    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music on SmartPhone");
    }

    @Override
    public void stop() {
        System.out.println("Stoping Music on SmartPhone");
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number + "from smartphone.");
    }

    @Override
    public void endCall() {
        System.out.println("Stopping call from smartphone.");
    }
}
