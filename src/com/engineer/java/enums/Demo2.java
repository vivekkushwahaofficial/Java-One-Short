package com.engineer.java.enums;

public class Demo2 {
    public static void main(String[] args) {
       // int status = PaymentStatus2.SUCCESS;
       PaymentStatus1 status = PaymentStatus1.SUCCESS;
       System.out.println(status.name());
    }
}
// Enum --> Enumerations ( Enumerated type)
// Enum represents a fixed set of predefined constants.
enum PaymentStatus1{
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}
