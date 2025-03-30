package com.icolor.arrays.binarysearchproblems;

import java.util.Scanner;

// Worst time complexity = BigO(logn)
// Best time complexity = Omega(1)
// Average time complexity = Theta(logn)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)

public class Square_Root {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for square root: ");
        int num = input.nextInt();

        int start = 0;
        int end = num;
        int mid = 0;
        int index = -1;

        while(start<=end) {

            if(num<2) {
                System.out.println(num);
                break;
            }

            mid = start+(end-start)/2;

            if(mid*mid==num) {
                index=mid;
                break;
            }
            else if(mid*mid>num) {
                end=mid-1;
            }
            else {
                index=mid;
                start=mid+1;
            }
        }
        System.out.println(index);
    }
}
