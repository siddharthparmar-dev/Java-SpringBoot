package com.OOPs;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];   // 5 is size of array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr));


        // 2D array
        int[][] Arr = new int[3][];
        Arr[0] = new int[3];
        Arr[1] = new int[5];
        Arr[2] = new int[4];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.println("Enter the value");
                Arr[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // printing values of 2D array

        //using for loop:
//        for (int i = 0; i < Arr.length; i++) {
//            System.out.println(Arrays.toString(Arr[i]));
//        }

        // Enhanced for loop:
//        for (int[] nums : Arr){
//            System.out.println(Arrays.toString(nums));
//        }
    }
}
