package com.engineer.java.OOP.inheritance;

public class Demo5 {

    public static void main(String[] args) {
        Notification notification = new Email("Welcome to Java!");
        notification.push();

        if(notification instanceof Email){
          Email email = (Email) notification;
          System.out.println("Downcasting successfull.");
        }

        Notification notification2 = new SMS("OTP sent");
        if(notification2 instanceof Email){
          Email email = (Email) notification2;
        }else{
          System.out.println("notification2 is not an Email object.");
        }
    }
}

class Notification {

    protected String message;

    public Notification(String message) {
      this.message = message;
    }

    void push() {
        System.out.println("Message Pushed");
    }
}

class Email extends Notification {

    Email(String message) {
    super(message);
    }

    @Override
    void push() {
        System.out.println("Message pushed through Email.");
    }

}

class SMS extends Notification {

    public SMS(String message) {
    super(message);
    }

    @Override
    void push() {
        System.out.println("Message pushed through SMS.");
    }

}
