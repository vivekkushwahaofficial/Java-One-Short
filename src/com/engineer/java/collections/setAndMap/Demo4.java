package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo4 {

    public static void main(String[] args) {
        // RollNo, Name
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Vivek");
        map.put(102, "Aditya");
        map.put(103, "Rohan");
        map.put(104, "Rohit");

        // System.out.println(map.size());
        // System.out.println(map.isEmpty());
        // System.out.println(map.containsKey(102));
        // System.out.println(map.containsValue("Vivek"));

        // System.out.println(map.get(101));
        // System.out.println(map.put(105, "Ankit"));
        // System.out.println(map);

        // map.remove(105);
        // Map<Integer, String> map2 = new HashMap<>();
        // map.putAll(map2);
        // map.clear();
        
        // Set<Integer> set = map.keySet();
        // System.out.println(set);

        // Collection<String> c = map.values();
        // System.out.println(c);
        
        // Set<Map.Entry<Integer, String>> entrys = map.entrySet();
        // System.out.println(entrys);

        // System.out.println(map.getOrDefault(105, "Unknown"));

        // System.out.println(map.putIfAbsent(103, "Abhay"));

        // map.remove(101,"Vivek");
        // map.replace(102, "Aditya","Abhay");
        // System.out.println(map);

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // for(Map.Entry<Integer, String> entry : entries){
        //     Integer key = entry.getKey();
        //     String value = entry.getValue();

        //     System.out.println(key + " , " + value);
        // }

        Map<Integer, String> map2 = Map.of(101, "Vivek", 102, "Aditya");
        map2.put(101,"Rohan");  //UnsupportedOperationException
        
    }
}

/*
put() --> always replace
putIfAbsent() --> does not replace existing value

*/