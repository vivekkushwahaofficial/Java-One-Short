package com.engineer.java.autoboxingAndUnboxing;

public class Demo3 {

    public static void main(String[] args) {

        // Parent class reference refers to child class object.
        Animal animal = new Dog("Bruno");
        animal.makeSound();
    }
}

abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method: child classes must provide implementation.
    abstract void makeSound();

    // Concrete method: already has implementation.
    void sleep() {
        System.out.println("Sleeping");
    }
}

// Child class extending the abstract class.
class Dog extends Animal {

    public Dog(String name) {

        // Calls the parent class constructor.
        super(name);
    }

    // Provides implementation of the abstract method.
    @Override
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

/*
--------------------------------------------
             Abstract Class
--------------------------------------------

1. Cannot be instantiated directly.

2. Can contain abstract methods
   (methods without a body).

3. Can contain concrete/normal methods.

4. Is designed to be extended by subclasses.

--------------------------------------------
       Important Interview Questions
--------------------------------------------

1. Can an abstract class have a constructor?
   --> Yes.

2. Can an abstract class be final?
   --> No.
      An abstract class must be extended,
      while final prevents inheritance.

3. Can an abstract class have static methods/variables?
   --> Yes.

4. Can an abstract class have private methods?
   --> Yes, but a private method cannot be abstract.

5. Can an abstract class have final methods?
   --> Yes.
      A final method cannot be overridden.

6. Can an abstract class have no abstract methods?
   --> Yes.

 */
