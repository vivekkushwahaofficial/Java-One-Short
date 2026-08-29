package com.engineer.java.autoboxingAndUnboxing;

public class Demo2 {

    public static void main(String[] args) {

        // ---------------------------------------------------------
        // 1. Primitive comparison
        // ---------------------------------------------------------

        int x = 100;
        int y = 100;

        // For primitive data types, == compares the actual values.
        // Both x and y contain 100, so the result is true.
        System.out.println(x == y);


        // ---------------------------------------------------------
        // 2. Wrapper object comparison
        // ---------------------------------------------------------

        Integer a = 200;
        Integer b = 200;

        // For objects, == compares object references,
        // not their actual values.
        // Therefore, a == b is generally false here.
        System.out.println(a == b);


        // ---------------------------------------------------------
        // 3. Comparing Integer values
        // ---------------------------------------------------------

        // intValue() converts Integer to int.
        // This is explicit unboxing.
        // Now == compares the primitive values.
        System.out.println(a.intValue() == b.intValue());


        // ---------------------------------------------------------
        // 4. Another reference comparison
        // ---------------------------------------------------------

        Integer m = 200;
        Integer n = 200;

        // m and n are Integer objects.
        // == checks whether both references point to the same object.
        // They are different objects here, so the result is false.
        System.out.println(m == n);
    }
}

/*
 * IMPORTANT INTERVIEW POINTS:
 *
 * 1. Primitive == Primitive
 *    -> Compares values.
 *
 * 2. Object == Object
 *    -> Compares references.
 *
 * 3. Integer.intValue()
 *    -> Converts Integer to int.
 *    -> This is explicit unboxing.
 *
 * 4. Integer.equals()
 *    -> Compares the values of Integer objects.
 *
 * 5. Do not use == to compare Integer values.
 *    -> Prefer equals() when comparing Integer objects.
 *
 * Example:
 * Integer a = 200;
 * Integer b = 200;
 *
 * a == b          -> Reference comparison
 * a.equals(b)     -> Value comparison
 */