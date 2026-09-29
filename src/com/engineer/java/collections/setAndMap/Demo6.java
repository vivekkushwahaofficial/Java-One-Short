package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101, "Vivek");
        map.put(102, "Aditya");
        map.put(103, "Rohan");
        map.put(104, "Rohit");

        // System.out.println(map.lastEntry());

        // System.out.println(map.headMap(103));
        // System.out.println(map.subMap(101, 103));
        
        //Sorted Map
        // System.out.println(map.lowerKey(102));
        // System.out.println(map.lowerEntry(102));
        // System.out.println(map.higherEntry(102));
        // System.out.println(map);

        // System.out.println(map.headMap(102));
        // System.out.println(map.descendingKeySet());
        // System.out.println(map.values());
        // System.out.println(map.descendingKeySet());

    }
  
}
