package com.engineer.java.innerclasses;

public class Test1 {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "ABC", "XYZ");
        computer.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");
    }
}
