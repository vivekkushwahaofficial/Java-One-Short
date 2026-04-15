package com.engineer.java.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LInkedHashMMapDemo {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Orange", 10);
        linkedHashMap.put("Apple", 20);
        linkedHashMap.put("Grave", 19);

        for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
