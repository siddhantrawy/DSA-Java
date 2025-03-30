package com.icolor.arrays.sortingalgorithms;

// Worst time complexity = BigO(n^2)
// Best time complexity = Omega(n)
// Average time complexity = Theta(n^2)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)

// First way to implement insertion sort

//public class InsertionSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        int temp = 0;
//
//        for(int i=1; i<arr.length; i++) {
//            for(int j=0; j<i; j++) {
//                if(arr[i]<arr[j]) {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//
//        for(int e: arr) {
//            System.out.print(e+" ");
//        }
//
//    }
//}


// Second way to implement insertion sort

//public class InsertionSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        int temp = 0;
//
//        for(int i=1; i<arr.length; i++) {
//            for(int j=i; j>0; j--) {
//                if(arr[j]<arr[j-1]) {
//                    temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//
//            }
//        }
//
//        for(int e: arr) {
//            System.out.print(e+" ");
//        }
//
//    }
//}


// Third way to implement insertion sort

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
        int temp = 0;

        for(int i=arr.length-1; i>=0; i--) {
            for(int j=i; j<arr.length-1; j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int e: arr) {
            System.out.print(e+" ");
        }

    }
}