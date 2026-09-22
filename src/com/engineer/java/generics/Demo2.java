package com.engineer.java.generics;

public class Demo2 {

    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("Vivek");
        Box b3 = new Box(true);

        // DownCasting
        // Integer x = (Integer) b1.getValue();
        // String s = (String) b2.getValue();
        // Boolean b = (Boolean) b3.getValue();

        // System.out.println(x + 5);
        // System.out.println(5 + 5);
        // System.out.println(b);

    }
}

class Box {

    private Object value;

    Box(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

// Object --> Too generic (Type information is lost)
/*
Key point to remember

Object allows us to store different types, but it is too generic
and does not preserve the specific type at the Box level. Generics 
allow us to preserve that type information and provide compile-time type safety.
*/