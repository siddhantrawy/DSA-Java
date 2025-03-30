package com.icolor.arrays.binarysearchproblems;

public class Peak_Index_In_Mountain_Array {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 8, 10, 8, 5};

        int start = 0;
        int end = arr.length-1;
        int mid;
        boolean check = false;

        while(start<=end) {
//            mid = start+(end-start)/2;  // Do not use it because if array will {1, 6, 4, 2, 3} then throw error

            mid = end+(start-end)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                System.out.println(mid);
                check = true;
                break;
            }
            else if(arr[mid]>arr[mid-1]) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        if(!check)
            System.out.println(-1);
    }
}
