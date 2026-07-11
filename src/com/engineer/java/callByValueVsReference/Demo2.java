package com.engineer.java.callByValueVsReference;

// Passing Objects to Methods (Reference Passed by Value)
public class Demo2 {

    public static void main(String[] args) {
        Point p = new Point(4, 5);

        System.out.println("Before Method : " + p.x + " , " + p.y);

        addTen(p);

        System.out.println("After Method  : " + p.x + " , " + p.y);
    }

    static void addTen(Point point) {
        point.x = point.x + 10;
        point.y = point.y + 10;

        System.out.println("Inside Method : " + point.x + " , " + point.y);
    }
}

class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

/*
----Output----
Before Method : 4 , 5
Inside Method : 14 , 15
After Method  : 14 , 15


==========================
PASSING OBJECTS TO METHODS
==========================

Definition:
Java passes a copy of the object's reference to the method.

Purpose:
Allows methods to modify the object's state.

Rules:
✔ Java is still Call by Value.
✔ The reference is copied.
✔ Both references point to the same object.
✔ Changes to object fields are visible outside the method.

Interview Point:

Java DOES NOT support Call by Reference.

For objects,
Java passes the reference by value.

Important:
✔ Object state can change.
✔ Reference variable itself is copied.
✔ Java is always Call by Value.
 */
