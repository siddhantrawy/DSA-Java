package com.icolor.arrays;

import java.util.Scanner;

// Worst time complexity = BigO(n)
// Best time complexity = Omega(1)
// Average time complexity = Theta(n)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)


public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        boolean check = false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                System.out.println(i);
                check = true;
                break;
            }
        }
        if(!check) {
            System.out.println("Not Found");
        }

    }
}
