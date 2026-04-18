package com.engineer.java.interfaces.animals;

public class TestAnimal {
    public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
        dog.eat();
        cat.eat();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);
        Animal.info();
        dog.run();
        cat.run();
    }
}
