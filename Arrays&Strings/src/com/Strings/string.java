package com.Strings;

public class string {
    public static void main(String[] args) {

        // Strings
        // Immutable and Mutable

        //Declaration of Strings
        // 1. using " ";
        String str = "Siddharth";
        // 2. using new keyword
        String str1 = new String("Siddharth");

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3==str4);  //true

        /*
        Java stores string literals in the String Constant Pool (SCP).

        If the same literal already exists, Java reuses the same object.

        So both str3 and str4 point to the same memory location
         */

        // using new keyword
        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5==str6); //false

        /*
        "hello" is placed in the String Constant Pool (if not already there).

        A new object is created in heap memory.

        So:

        str5 → new heap object
        str6 → another new heap object

        Different memory addresses

        == compares references → different objects → false.
         */

        //lang package classes
        //already present in java language like utill net scan etc
        // so we dont have to use import keyword to use class

        // other than those classes , we have use import keyword to use any predefined class
    }
}
