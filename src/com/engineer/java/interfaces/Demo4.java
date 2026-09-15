package com.engineer.java.interfaces;

public class Demo4 {

    public static void main(String[] args) {

        // Upcasting: StreetDog object is referenced by the Animal interface
        Animal a = new StreetDog();

        // Animal reference can directly call only methods declared in Animal
        a.eat();

        // Downcasting: Convert Animal reference to Dog reference
        // Now we can access the bark() method declared in Dog
        ((Dog) a).bark();

        // Dog reference pointing to a StreetDog object
        // Dog inherits eat() from Animal and declares bark()
        Dog dog = new StreetDog();

        // eat() is accessible because Dog extends Animal
        dog.eat();

        // bark() is directly accessible because it is declared in Dog
        dog.bark();

        // StreetDog reference pointing directly to a StreetDog object
        // All methods available in StreetDog can be accessed directly
        StreetDog sd = new StreetDog();

        sd.eat();
        sd.bark();
    }
}

// Interface Inheritance
interface Animal {

    void eat();
}

interface Dog extends Animal {

    void bark();
}

class StreetDog implements Animal, Dog {

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
}
