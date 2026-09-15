package com.engineer.java.interfaces;

public class Demo {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay();

        Payment p2 = new DebitCard();
        p2.pay();
    }
  
}
//Ploymorphism
interface Payment{
    void pay();
}

class DebitCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment via DebitCard");
    }
}

class CreditCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment via CreditCard");
    }
}