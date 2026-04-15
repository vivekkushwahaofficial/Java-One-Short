package com.engineer.java.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akshit");
        map.put(2, "Vivek");
        System.out.println(map);

        String student = map.get(2);
        System.out.println(student);

        String s = map.get(69);
        System.out.println(s);

        map.containsKey(6);
        System.out.println(map.containsKey(6));
        System.out.println(map.containsValue("Vivek"));

        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + ": " + entry.getValue());
                entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(2);
        System.out.println(map);
    }
}
