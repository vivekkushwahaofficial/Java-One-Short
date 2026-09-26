package com.engineer.java.generics.wildcards;

public class Demo {

    public static void main(String[] args) {
        // Invatiant in generics
        // Animal animal = new Animal();
        // animal.eat();
        // animal.walk();

        // List<Dog> dog = new ArrayList<>();
        // List<Animal> animals = dog;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;  
    }

}

class Animal {

    void eat() {
        System.out.println("Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}
