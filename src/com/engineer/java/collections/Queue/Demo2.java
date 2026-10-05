package com.engineer.java.collections.Queue;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        // mean heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(40);
        pq.offer(60);
        pq.offer(70);

        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());
        // System.out.println(pq.poll());

        // max heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b) -> b-a);
        pq2.offer(10);
        pq2.offer(30);
        pq2.offer(40);
        pq2.offer(60);
        pq2.offer(70);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
    }

}
