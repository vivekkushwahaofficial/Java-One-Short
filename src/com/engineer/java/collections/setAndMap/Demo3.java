package com.engineer.java.collections.setAndMap;

import java.util.*;

public class Demo3 {

    public static void main(String[] args) {
        // TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Set<Integer> set2 = new TreeSet<>(List.of(1,2,3,4,5,6,7,8,9));
        set.add(12);
        set.add(23);
        set.add(90);
        set.add(10);
        set.add(199);
        set.add(99);
        set.add(80);
        set.add(60);
        set.add(32);

        //SortedSet Interface
        // System.out.println(set.first());
        // System.out.println(set.last());
        // System.out.println(set.headSet(60));
        // System.out.println(set.tailSet(30));
        // FromElement is inclusive and toElement is exclusive
        // System.out.println(set.subSet(23, 100));
        //NavigableSet
        //largest number smaller than 80
        // System.out.println(set.lower(80));
        //gretest element less than or equal to 80
        // System.out.println(set.floor(80));
        // smallest number greater than 80
        // System.out.println(set.higher(80));
        // smallest number greater than or equal to 80
        // System.out.println(set.ceiling(80));
        // System.out.println(set.pollFirst());
        // System.out.println(set.pollLast());
        // System.out.println(set.first());
        // System.out.println(set.descendingSet());
        // Iterator<Integer> it = set.descendingIterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // System.out.println(set.headSet(80,true));
        System.out.println(set.tailSet(80, false));
    }

}
