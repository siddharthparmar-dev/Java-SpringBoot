package com.Arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        double[][] arr = new double[4][3];
        System.out.println(arr.getClass().getName());

        int arr2[] = {4,5,8,2,1,9,7,6};
        //Utility ==> Arrays
        System.out.println(arr2);

        // using for each loop:
        for (int n : arr2){
            System.out.print(n + " ");
        }


        //for sorting :
        Arrays.sort(arr2);
        System.out.println("After sorting");
        for (int n : arr2){
            System.out.print(n + " ");
        }
        System.out.println();

        //binary search in array
        int val = Arrays.binarySearch(arr2,5);
        System.out.println(val);
    }
}
