package com.engineer.java.oops;
import com.sun.source.tree.NewArrayTree;

//public class AnimalTest {
//    public static void main(String[] args){
//        Cat a = new Cat();
//        a.name = "bob";
//        Cat cat = makeCatNameUpperCase(a);
//        System.out.println(cat.name);
//        System.out.println(a.name);
//    }
//    public static Cat makeCatNameUpperCase(Cat cat){
//        cat.name = cat.name.toUpperCase();
//        return cat;
//    }
//}

public class AnimalTest {
    public static void main(String[] args){
        Cat a = new Cat();
        a.name = "bob";
        makeCatNameUpperCase(a);
        System.out.println(a.name);
    }
    public static void makeCatNameUpperCase(Cat cat){
        cat.name = cat.name.toUpperCase();
    }
}
