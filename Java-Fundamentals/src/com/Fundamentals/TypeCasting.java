package com.Fundamentals;

public class TypeCasting {
    public static void main(String[] args) {

        /*
        type casting : changing the data from one form to another

        type casting are mainly of 2 types : implicit and explicit
         */

        // implicit type casting or numeric type promotion:
        byte a = 45;
        System.out.println(a); //45

        double b;
        b = a;

        System.out.println(b);  //45.0


        //explicit casting

        double c = 45.5;
        byte d;
        d = (byte) c;
        System.out.println(d);  //45

        //===================================================================

        int e = 12;
        int f = 9;

        float g = e*f;
        System.out.println(g);  // 108.0
    }
}
