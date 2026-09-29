package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Vivek");
        set.add("Rohit");
        set.add("Rohan");
        set.add("Aditya");

        // System.out.println(set.contains("Aditya"));

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Vivek");
        map.put(102, "Aditya");
        map.put(103, "Rohit");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));
    }
}
