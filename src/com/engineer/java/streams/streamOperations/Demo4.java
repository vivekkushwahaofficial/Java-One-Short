package com.engineer.java.streams.streamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class Demo4 {

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>(List.of(1,13,11, 14 ,9));
        List<String> map = new ArrayList<>(List.of("AA", "BBB", "CCCC", "DD", "EEE"));

        // List<Integer> list2 = list.stream()
        //                           .map(x -> x + 1)
        //                           .collect(Collectors.toList());

        // Set<Integer> list2 = list.stream()
        //                          .map(x -> x + 1)
        //                           .collect(Collectors.toSet());
        // System.out.println(list2);

        // Map<Integer, String> mp = map.stream()
        //                              .collect(Collectors.toMap(
        //                                 x ->x.length(),
        //                                 x -> x));
        // System.out.println(mp);

        // Map<Integer, List<String>> mp2 = map.stream()
        //                     .collect(Collectors.groupingBy(x -> x.length()));
        // System.out.println(mp2);

        // Map<Boolean, List<Integer>> mp3 = list.stream()
        //                                      .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        // System.out.println(mp3);

        // Map<Integer, List<String>> mp4 = map.stream()
        //                                     .collect(Collectors.groupingBy(
        //                                         x -> x.length(),
        //                                         Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));  
        // System.out.println(mp4);

        String result = map.stream()
                            .collect(Collectors.joining("_"));
        System.out.println(result);
    }
}

/*
toLit(), toSet(), toMap()
groupingBy()  -> mapping()
partitioningBy()
joining
*/