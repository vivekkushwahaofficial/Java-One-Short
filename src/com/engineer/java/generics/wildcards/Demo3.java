package com.engineer.java.generics.wildcards;

import java.util.ArrayList;
import java.util.List;
// Wildcard with upper bound(extends)

public class Demo3 {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());

        fun(dogs);
    }

    static void fun(List<? extends Animal> values) {
        for (Animal a : values) {
            a.eat();
        }
    }
}

class Animal {

    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}
