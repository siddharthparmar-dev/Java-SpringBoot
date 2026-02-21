package com.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
        System.out.println(str.endsWith("Roy"));
        System.out.println(str.startsWith("Mohan"));
        System.out.println(str.startsWith("Raja"));
        System.out.println(str.length());
        char ch[] = str.toCharArray();
        for (char c : ch){
            System.out.println(c);
        }
        System.out.println(str.substring(0,7));
        System.out.println(str.substring(7));
    }
}
