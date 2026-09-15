package com.engineer.java.interfaces;

public class Demo7 {
    public static void main(String[] args) {
        R r = new R();
        r.fun();
    }
}
// Java Resolution priority rule
interface P{
    default void fun(){
        System.out.println("Inside P interface");
    }
    
}

class Q{
    public void fun(){
        System.out.println("Inside Q class");
    }
}
// Class method has priority over interface default method
class R extends Q implements P{
   @Override 
    public void fun(){
        System.out.println("Inside R class");
    }
}