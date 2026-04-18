package com.engineer.java.interfaces.devices;

public class TestSmartPhone {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("1234567890 ");
        smartPhone.endCall();
        smartPhone.stop();
        smartPhone.takePhoto();
        smartPhone.recordVideo();
    }
}
