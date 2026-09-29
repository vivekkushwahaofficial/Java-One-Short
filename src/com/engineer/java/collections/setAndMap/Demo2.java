package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo2 {

    public static void main(String[] args) {
        //Constructors of HashSet/LinkedHashSet      
        Set<Integer> set = new HashSet<>();

        // Initial capacity
        Set<Integer> set2 = new LinkedHashSet<>(100);

        // capacity, Load factor
        Set<Integer> set3 = new LinkedHashSet<>(100, 0.8F);

        //Using another collection
        Set<Integer> set4 = new LinkedHashSet<>(List.of(1,2,3,4,5,6,7,8,9));


    }
}
