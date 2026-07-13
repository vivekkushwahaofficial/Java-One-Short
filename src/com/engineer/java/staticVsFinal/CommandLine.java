package com.engineer.java.staticVsFinal;

public class CommandLine {

    public static void main(String[] args) {

        System.out.println("Number of arguments is : " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + " : " + args[i]);
        }
    }
}


/*
-----Input-----
javac CommandLine.java
java CommandLine Vivek Java Spring Boot

------Output------

Number of arguments is : 4
Argument 0 : Vivek
Argument 1 : Java
Argument 2 : Spring
Argument 3 : Boot


                    CLASS AREA
           +-------------------------+
           |      CommandLine        |
           +-------------------------+

                     STACK
           +-------------------------+
           | main()                  |
           |-------------------------|
           | args ----------------+  |
           +----------------------|--+
                                  |
                                  ▼

                      HEAP
        +----------------------------------+
        | String[]                    |
        |----------------------------------|
        | [0] = "Vivek"                    |
        | [1] = "Java"                     |
        | [2] = "Spring"                   |
        | [3] = "Boot"                     |
        +----------------------------------+
*/
