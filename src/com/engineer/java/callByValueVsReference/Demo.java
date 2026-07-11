package com.engineer.java.callByValueVsReference;

// Call By Value(Primitive)
public class Demo {

    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println("Before Method : " + x + " , " +y);

        callByValue(x, y);
        System.out.println("After Method : " + x + " , " + y);
    }

    static void callByValue(int x, int y) {
        x = x + 10;
        y = y + 10;

        System.out.println("Inside Method : " + x + " , " + y);
    }
}

/*
==========================
CALL BY VALUE
==========================

Definition:
Call by Value means Java passes a copy of the variable's value
to the method.

Purpose:
Used to protect the original variable from being modified
inside the called method.

Syntax:

callByValue(x, y);

Rules:
✔ Java always passes a copy of primitive values.
✔ Changes inside the method do not affect the original variables.
✔ Primitive data types always use Call by Value.

Execution:

Before Method:
x = 4
y = 5

Inside Method:
x = 14
y = 15

After Method:
x = 4
y = 5

Interview Point:

Java is always Call by Value.
For objects, Java passes the reference by value,
not Call by Reference.

Important:
✔ Original variables remain unchanged.
✔ Only copied values are modified.
✔ Primitive data types always follow Call by Value.
*/