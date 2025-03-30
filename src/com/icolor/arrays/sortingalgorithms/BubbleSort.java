package com.icolor.arrays.sortingalgorithms;

// Worst time complexity = BigO(n^2)
// Best time complexity = Omega(n)
// Average time complexity = Theta(n^2)
// Auxiliary space complexity = O(1)
// Total space complexity = O(n)

// First way to implement bubble sort -- Increasing Order

//public class BubbleSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        int temp = 0;
//
//        for(int i=0; i<arr.length; i++) {
//            boolean check = false;
//            for(int j=0; j<arr.length-i-1; j++) {
//                if(arr[j]>arr[j+1]) {
//                    check = true;
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//            // Check if no any swap occur
//            if(!check) {
//                break;
//            }
//        }
//        // Print sorting array
//        for(int e: arr)
//            System.out.print(e+" ");
//    }
//}


// Second way to implement bubble sort -- Decreasing Order

//public class BubbleSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        int temp = 0;
//
//        for(int i=0; i<arr.length; i++) {
//            boolean check = false;
//            for(int j=0; j<arr.length-i-1; j++) {
//                if(arr[j]<arr[j+1]) {
//                    check = true;
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//            // Check if no any swap occur
//            if(!check) {
//                break;
//            }
//        }
//        // Print sorting array
//        for(int e: arr)
//            System.out.print(e+" ");
//    }
//}


// Third way to implement bubble sort -- Decreasing Order

//public class BubbleSort {
//
//    public static void main(String[] args) {
//
//        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
//        int temp = 0;
//
//        for(int i=0; i<arr.length; i++) {
//            boolean check = false;
//            for(int j=arr.length-1; j>0; j--) {
//                if(arr[j]<arr[j-1]) {
//                    check = true;
//                    temp=arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=temp;
//                }
//            }
//            // Check if no any swap occur
//            if(!check) {
//                break;
//            }
//        }
//        // Print sorting array
//        for(int e: arr)
//            System.out.print(e+" ");
//    }
//}



// Fourth way to implement bubble sort -- Increasing Order

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{23, 64, 98, 86, 64, 23, 99, 10, 32, -87};
        int temp = 0;

        for(int i=0; i<arr.length; i++) {
            boolean check = false;
            for(int j=arr.length-1; j>0; j--) {
                if(arr[j]>arr[j-1]) {
                    check = true;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            // Check if no any swap occur
            if(!check) {
                break;
            }
        }
        // Print sorting array
        for(int e: arr)
            System.out.print(e+" ");
    }
}

