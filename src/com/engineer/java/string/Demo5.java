package com.engineer.java.string;

public class Demo5 {

    public static void main(String[] args) {

        String s1 = new String("Vivek");

        // Length / Emptiness
        System.out.println("Length / Emptiness");
        System.out.println(s1.length()); // 5
        System.out.println(s1.isEmpty()); //false
        System.out.println(s1.isBlank()); //false
        System.out.println();

        String s2 = new String("");

        System.out.println(s2.length()); // 0
        System.out.println(s2.isEmpty()); //true
        System.out.println(s2.isBlank()); //true
        System.out.println();

        String s3 = new String("    ");

        System.out.println(s3.length()); // 4
        System.out.println(s3.isEmpty()); //false
        System.out.println(s3.isBlank()); //true
        System.out.println();

        String v1 = new String("Vivek");
        String p1 = new String("VIVEK");
        String d1 = new String("abc");
        String e1 = new String("abe");
        String f1 = new String("   Vi  vek   ");

        //Character access
        System.out.println("Character access");
        // System.out.println(v1.charAt(2));
        char[] arr = v1.toCharArray();  // ['V', 'i', 'v', 'e', 'k']
        System.out.println(arr);        // Vivek
        System.out.println();

        // Comparison
        System.out.println("Comparison");
        System.out.println(s1.equals(v1));  // compares references
        System.out.println(s1 == v1);       // compares value
        System.out.println(s1.equalsIgnoreCase(p1));
        System.out.println(d1.compareTo(e1));  // compares ascii value
        System.out.println();

        // Searching
        System.out.println("Searching");
        System.out.println(s1.contains("iv"));
        System.out.println(s1.indexOf("ek"));

        System.out.println(s1.startsWith("Vi"));
        System.out.println();

        //Extraction/Transformation
        System.out.println("Extraction/Transformation");
        System.out.println(s1.substring(1, 4));

        System.out.println(s1.toUpperCase());
        System.out.println(f1.trim());   //remove space
        System.out.println(f1.strip());  //unicode friendly
        System.out.println(s1.repeat(3));
        System.out.println(s1.replace("V", "v"));
        System.out.println(v1.replace("Vive", "mar"));
        System.out.println(s1.replaceAll("V", "v"));

        System.out.println();
        String a1 = "Vivek-Rohit-Aditya";
        String[] arr1 = a1.split("-");
        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println(String.join("-", "a", "b", "c"));
        System.out.println();

        //Conversion
        System.out.println("Conversion");
        String b1 = new String(String.valueOf(10));

        byte[] arr2 = s1.getBytes();
        for (byte i : arr2) {
            System.out.print(i + " , ");
        }
        System.out.println();
        System.out.println();

        // Advance --> intern(), format()
        System.out.println("Advance --> intern(), format()");
        String c1 = new String("Hello");
        // String c2 = c1;
        String c2 = c1.intern();
        System.out.println(c1 == c2);

        // Format
        System.out.println("Format");
        String name = "Aditya";
        int age = 28;

        //Hello Aditya, YOur age is 28.
        System.out.println("Hello " + name + ", " + "Your age is " + age + ".");
        System.out.println(String.format("Hello %S, Your age is %S.", name, age));

    }
}
