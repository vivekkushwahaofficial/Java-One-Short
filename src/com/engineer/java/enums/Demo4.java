package com.engineer.java.enums;

public class Demo4 {

    public static void main(String[] args) {
        Direction1 d = Direction1.NORTH;
        d.move();
    }

}

enum Direction1 {
    NORTH {
        @Override
        public void move() {
            System.out.println("Move up (y + 1)");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Move up (y + 1)");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Move right (x + 1)");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Move left (x - 1)");
        }
    };

    public abstract void move();
}
