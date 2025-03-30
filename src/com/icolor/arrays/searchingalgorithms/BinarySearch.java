package com.icolor.arrays.searchingalgorithms;

// Worst time complexity = BigO(logn)
// Best time complexity = Omega(1)
// Average time complexity = Theta(logn)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)

// First way to implement binary search -- Best way

//public class BinarySearch {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{-87, 10, 23, 32, 64, 86, 98, 99, 123};
//        int key = 99;
//        int start = 0;
//        int end = arr.length-1;
//        boolean found = false;
//
//        while(start<=end) {
//            int mid = start + (end-start)/2;
//            if(key==arr[mid]) {
//                System.out.println(mid);
//                found = true;
//                break;
//            }
//            else if(key<arr[mid]) {
//                end = mid-1;
//            }
//            else {
//                start=mid+1;
//            }
//        }
//        if(!found)
//            System.out.println("Not Found");
//    }
//}



// Second way to implement binary search
// This way is not good because it may throw error "yield of range"

//public class BinarySearch {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{-87, 10, 23, 32, 64, 86, 98, 99, 123};
//        int key = 99;
//        int start = 0;
//        int end = arr.length-1;
//        boolean found = false;
//
//        while(start<=end) {
//            int mid = (end+start)/2;
//            if(key==arr[mid]) {
//                System.out.println(mid);
//                found = true;
//                break;
//            }
//            else if(key<arr[mid]) {
//                end = mid-1;
//            }
//            else {
//                start=mid+1;
//            }
//        }
//        if(!found)
//            System.out.println("Not Found");
//    }
//}



// Third way to implement binary search

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{-87, 10, 23, 32, 64, 86, 98, 99, 123};
        int key = 99;
        int start = 0;
        int end = arr.length-1;
        boolean found = false;

        while(start<=end) {
            int mid = end + (start-end)/2;
            if(key==arr[mid]) {
                System.out.println(mid);
                found = true;
                break;
            }
            else if(key<arr[mid]) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        if(!found)
            System.out.println("Not Found");
    }
}