package com.engineer.java.string;

public class Demo6 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();

        // append()
        s.append("abcde");
        sb.append("Vivek");
        sb.append(" Kumar");
        // System.out.println(sb);

        /*
        // insert()
        s.insert(2, 'O');
        System.out.println(s);

        // delete()
        s.delete(0, 2);
        System.out.println(s);

        s.deleteCharAt(2);
        System.out.println(s);

        // replace()
        s.replace(1, 3, "xy");
        System.out.println(s);

        // reverse()
        s.reverse();
        System.out.println(s);

        System.out.println(s.charAt(1));

        s.setCharAt(1, 'b');
        System.out.println(s);

        System.out.println(sb.capacity());
        sb.capacity();

        s.ensureCapacity(100);
        System.out.println(s.capacity());
         */
        s.trimToSize();
        System.out.println(s.capacity());
    }
}
/*
### StringBuilder — Quick Notes

````md
# StringBuilder — Quick Revision

`StringBuilder` is a mutable sequence of characters.

```java
StringBuilder sb = new StringBuilder();
````

## Common Methods

| Method             | Use                                |
| ------------------ | ---------------------------------- |
| `append()`         | Adds data at the end               |
| `insert()`         | Inserts data at an index           |
| `delete()`         | Deletes characters from a range    |
| `deleteCharAt()`   | Deletes one character              |
| `replace()`        | Replaces characters in a range     |
| `reverse()`        | Reverses the sequence              |
| `charAt()`         | Gets a character                   |
| `setCharAt()`      | Changes a character                |
| `capacity()`       | Returns current capacity           |
| `ensureCapacity()` | Increases capacity if needed       |
| `trimToSize()`     | Reduces capacity to current length |

## Example

```
StringBuilder sb = new StringBuilder();

sb.append("abcde");      // abcde
sb.insert(2, 'O');       // abOcde
sb.delete(0, 2);         // Ocde
sb.deleteCharAt(1);      // Oe
sb.replace(0, 1, "xy");  // xye
sb.reverse();            // eyx
```
 */
