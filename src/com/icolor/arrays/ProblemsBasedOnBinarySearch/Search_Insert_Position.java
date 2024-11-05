package com.icolor.arrays.ProblemsBasedOnBinarySearch;

import java.util.Scanner;

// Using linear search

//public class Search_Insert_Position {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{1, 4, 6, 8, 10, 14, 16, 18};
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter target value: ");
//        int target = input.nextInt();
//
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]==target) {
//                System.out.println(i);
//                break;
//            }
//            else if(arr[i]<target) {
//                continue;
//            }
//            else {
//                System.out.println(i);
//                break;
//            }
//        }
//    }
//}


// Using binary search

public class Search_Insert_Position {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, 6, 8, 10, 14, 16, 18};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target = input.nextInt();

        int start = 0;
        int end = arr.length-1;
        int index = arr.length;

        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                index=mid;
                break;
            }
            else if(arr[mid]<target) {
                start=mid+1;
            }
            else {
                index=mid;
                end=mid-1;
            }
        }
        System.out.println(index);
    }
}