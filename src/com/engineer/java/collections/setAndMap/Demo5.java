package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo5 {

    public static void main(String[] args) {
        //HashMap/ LinkedHashMap
        Map<Integer, String> map = new HashMap<>();

        Map<Integer, String> map2 = new LinkedHashMap<>(100);

        Map<Integer, String> map3 = new LinkedHashMap<>(100, 0.8f);

        Map<Integer, String> map4 = new HashMap<>(map3);

    }

}
