package com.engineer.java.functionalinterface;

import java.util.function.*;

public class Demo3 {

    public static void main(String[] args) {

        //(x + 2) * 3
        // Function<Integer, Integer> equation = x -> ((x + 2) * 3);
        Function<Integer, Integer> add2 = x -> (x + 2);
        Function<Integer, Integer> multiply3 = x -> (x * 3);

        // int ans = multiply3.apply(add2.apply(2));
        int ans = add2.andThen(multiply3).apply(2);
        System.out.println(ans);
    }
}
