package com.icolor.arrays;

public class FindArraySum {

    public static void main(String[] args) {

        int[] arr = new int[]{-87, 10, 23, 32, 64, 86, 98, 99, 123};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
    }
}
