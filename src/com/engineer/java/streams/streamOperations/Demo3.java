package com.engineer.java.streams.streamOperations;

import java.util.*;

public class Demo3 {

    public static void main(String[] args) {
        // Terminal Operation
        List<Integer> list = new ArrayList<>(List.of(1, 13, 11, 9));

        // Set<Integer> list2 = list.stream()
        //     .map(x -> x + 1)
        //     // .toList();
        //     .collect(Collectors.toSet());

        // System.out.println(list2);

        // int sum = list.stream()
        //     .reduce(0,(a,b) -> a + b);
        // System.out.println(sum);

        // Long num = list.stream()
        //     .filter(x -> x > 10)
        //     .count();
        // System.out.println(num);

        // Optional<Integer> num = list.stream()
        //     .filter(x -> x > 10)
        //     // .findFirst();
        //     .findAny();
        // System.out.println(num.get());

        // boolean num = list.stream()
        //     .filter(x -> x > 10)
        //     // .allMatch(x -> x %  2 == 0);
        //     // .anyMatch(x -> x %  2 == 0);
        //     .noneMatch(x -> x %  2 == 0);
        //     System.out.println(num);

        // int sum = list.stream()
        //     .filter(x -> x > 10)
        //     .mapToInt(x -> x)
        //     .sum();
        // System.out.println(sum);

        // OptionalInt max = list.stream()
        //     .filter(x -> x > 10)
        //     .mapToInt(x -> x)
        //     .max();
        // System.out.println(max.getAsInt());

        OptionalDouble avg = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .average();
        System.out.println(avg.getAsDouble());

    }
}

/*
forEach()
toList()
collect() -> Collector
reduce() -> combine stream element into single value
count()
findFirst() -> short circuiting
anyMatch(), allMatch(), noneMatch()
sum(), average(), max(), min()--> primitive streams
*/