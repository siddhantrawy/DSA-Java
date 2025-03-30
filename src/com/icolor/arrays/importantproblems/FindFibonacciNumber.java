package com.icolor.arrays.importantproblems;

import java.util.Scanner;

// Below code will use to ranges 47th Fibonacci number
public class FindFibonacciNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fibonacci number index: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i<size; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(size+"th"+" Fibonacci Number is "+arr[size-1]);

    }
}
