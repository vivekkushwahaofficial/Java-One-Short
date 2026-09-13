package com.engineer.java.enums;

public class Demo5 {

    public static void main(String[] args) {
        //     Direction2[] direction2s = Direction2.values();
        //     for(Direction2 d : direction2s){  // ForEach loop
        //         System.out.println(d.name());
        //     }

        Direction2 d = Direction2.valueOf("EAST");
        System.out.println(d.name());  
        System.out.println(d.toString());
        System.out.println(d);
        System.out.println(d.ordinal());
    }
}

// value() --> We can iterate in this enum
// valueOf() --> Convert a String into a enum constant
// name() VS toString() -->
// ordinal()
// toString(), equals(), hashCode()

enum Direction2 {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    // @Override
    // public String toString(){
    //     return this.name() + " Direction";
    // }
}
