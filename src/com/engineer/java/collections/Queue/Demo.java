package com.engineer.java.collections.Queue;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // Single ended Queue
        //enqueue
        queue.add(1); // exception
        queue.offer(2); // false
        queue.offer(3);

        // front access
        System.out.println(queue.peek()); // return null if not present
        System.out.println(queue.element()); // exception if not present

        // element remove
        queue.poll();    // safer (return null)
        queue.remove();  // unsafe (throw exception)


    }
}
