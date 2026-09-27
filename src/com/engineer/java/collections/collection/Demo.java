package com.engineer.java.collections.collection;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        c.add(1);
        c.add(2);
        c.add(3);

        //size()
        int n = c.size();
        // System.out.println(c.size());

        // System.out.println(c.isEmpty());
        // c.size() == 0

        // boolean contains(Object 0) --> 1, 2, 3
        // System.out.println(c.contains(2));

        //iterate() --> iterator

        //Object[] toArray();

        // Object[] obj = c.toArray();
        // or (Object o : obj) {
        //     System.out.println(o);   
        // }

        // T[] toArray(T[] a)
        Integer[] arr = c.toArray(new Integer[0]);
        for(Integer i : arr){
            // System.out.println(i);
        }

        // boolean add(E e)
        boolean b = c.add(3);
        // System.out.println(b);

        //boolean remove(Object obj)

        // System.out.println(c.remove(3));
        // for(Integer i : c){
        //     System.out.println(i);
        // }
    
        //boolean addAll(Collection < ? extends E> c)
        // c.addAll(List.of(5, 6, 7, 8, 9));
        // System.out.println(c);

        // boolean containsAll(Collection<?> c)
        System.out.println(c.containsAll(List.of(1, 2, 3)));

        //boolean removeAll(Collection<?> c)

        // c.removeAll(List.of(1, 2));
        // c.retainAll(List.of(1, 2));
        c.clear();
        System.out.println(c);
    }
}

// aadd, remove, addAAll, retainAll, containsAll, toArray, iterator, saize, isEmpty
