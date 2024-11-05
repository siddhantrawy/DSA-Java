package com.icolor.arrays.ProblemsBasedOnBinarySearch;

import java.util.Scanner;

// This question is solved by using linear search but time complexity of linear search is higher than binary search

public class Count_Occurrence {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 6, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a target value: ");
        int target = input.nextInt();

        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        int first = -1, last = -1;

        while(start<=end) {
            mid = start+(end-start)/2;
            if(arr[mid]==target) {
                first=mid;
                end=mid-1;
            }
            else if(arr[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        start = 0;
        end = arr.length-1;

        while(start<=end) {
            mid = start+(end-start)/2;
            if(arr[mid]==target) {
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]>target) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        System.out.println("Occurrence count: "+((last-first)+1));

    }
}
