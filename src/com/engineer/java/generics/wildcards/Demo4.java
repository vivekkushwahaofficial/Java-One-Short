package com.engineer.java.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        fun(animals);
    }

    public static void fun(List<? super Animal> values) {
       // writing
        values.add(new Animal());
        values.add(new Cat());
        values.add(new LabraDor());
        values.add(new Cat());

        // reading
        for (Object obj : values) {
            Animal a = (Animal) obj;
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

class LabraDor extends Animal{

}

class Cat extends Animal {

}
