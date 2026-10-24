package com.engineer.java.streams.optional;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {
        Optional<String> name = getName();
        // if (name.isPresent()) {
        //     System.out.println(name.get());
        // }
        // name.ifPresent(System.out::println);     // :: -> Method reference
        // System.out.println(name.orElse("Unknown"));
        // System.out.println(name.orElseGet(() -> "Unknown"));
        // System.out.println(name.orElseThrow());
        name.ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
    }

    public static Optional<String> getName() {
        return Optional.of("Vivek");
        // return Optional.ofNullable(null);
    }

}
