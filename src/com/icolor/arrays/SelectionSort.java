package com.icolor.arrays;

// Worst time complexity = BigO(n^2)
// Best time complexity = Omega(n^2)
// Average time complexity = Theta(n^2)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)

// First way to write selection sort

//public class SelectionSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//
//        // Loop for round
//        for(int i=0; i<arr.length-1; i++) {
//            int temp=0;
//            // Loop for sorting
//            for(int j=i+1; j<arr.length; j++) {
//                if(arr[i]>arr[j]) {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        // Print sorting array
//        for(int e: arr)
//            System.out.print(e+" ");
//    }
//}

// Second way to write selection sort

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
        int temp = 0;

        // Loop for round
        for(int i=0; i<arr.length-1; i++) {
            int index = i;
            // Loop for sorting
            for(int j=i+1; j<arr.length; j++) {
                if(arr[index]>arr[j]) {
                    index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        // Print sorting array
        for(int e: arr)
            System.out.print(e+" ");
    }
}