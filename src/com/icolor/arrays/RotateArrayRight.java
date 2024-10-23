package com.icolor.arrays;

// Rotate array by 1 -------- First way
//public class RotateArrayRight {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        int size = arr.length;
//        int[] temp = new int[size];
//
//        for(int i=1; i<size; i++) {
//            temp[i]=arr[i-1];
//        }
//        temp[0]=arr[size-1];
//
//        for (int i=0; i<size; i++) {
//            arr[i]=temp[i];
//        }
//
//        for (int j : arr) {
//            System.out.printf(j + " ");
//        }
//
//    }
//}

// Rotate array by 1 -------- Second way
public class RotateArrayRight {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int size = arr.length;
        int temp = arr[size-1];
        for(int i=size-1; i>0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int e : arr) {
            System.out.print(e+" ");
        }
    }
}
