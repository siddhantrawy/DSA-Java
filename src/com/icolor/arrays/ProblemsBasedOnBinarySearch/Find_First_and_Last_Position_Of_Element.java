package com.icolor.arrays.ProblemsBasedOnBinarySearch;

//import java.util.Scanner;

// Using linear search

//public class Find_First_and_Last_Position_Of_Element {
//
//    public static void main(String[] args) {
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        Scanner input = new Scanner(System.in);
//        int key = input.nextInt();
//        boolean check = false;
//
//        // First occurrence
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]==key) {
//                System.out.println(i);
//                check = true;
//                break;
//            }
//        }
//        if(!check) {
//            System.out.println("Not Found");
//        }
//
//        // Last occurrence
//        for(int i=arr.length-1; i>=0; i--) {
//            if(arr[i]==key) {
//                System.out.println(i);
//                check = true;
//                break;
//            }
//        }
//        if(!check) {
//            System.out.println("Not Found");
//        }
//
//    }
//}


// Using binary search

public class Find_First_and_Last_Position_Of_Element {

    public static void main(String[] args) {

        int[] arr = new int[]{-87, 10, 23, 23, 23, 23, 23, 23, 99};
        int key = 23;
        int first=-1, last=-1;
        int start=0, end=arr.length-1;
        int mid=0;

        // First occurrence
        while(start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]==key) {
                first = mid;
                end=mid-1;
            }
            else if(arr[mid]>key) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        start=0;
        end=arr.length-1;

        // Last occurrence
        while(start<=end) {
            mid=start+(end-start)/2;
            if(arr[mid]==key) {
                last=mid;
                start=mid+1;
            }
            else if(arr[mid]>key) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        System.out.println(first);
        System.out.println(last);


    }
}

