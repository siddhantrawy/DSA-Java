package com.icolor.bitmanipulation;

import java.util.Scanner;

// First way

//public class ClearRangeOfBits {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        System.out.print("Enter value of start: ");
//        int start = input.nextInt();
//        System.out.print("Enter value of end: ");
//        int end = input.nextInt();
//
//        int temp1 = ((~0)<<end);
//        int temp2 = (~temp1)>>(end-start+1);
//        int temp3 = temp1|temp2;
//        int res = num&temp3;
//
//        System.out.println("Number after range of bit clear: "+res);
//
//    }
//}




// Second way

public class ClearRangeOfBits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter value of start: ");
        int start = input.nextInt();
        System.out.print("Enter value of end: ");
        int end = input.nextInt();

        int temp1 = ((~0)<<end);
        int temp2 = (1<<(start-1))-1;
        int temp3 = temp1|temp2;
        int res = num&temp3;

        System.out.println("Number after range of bit clear: "+res);

    }
}
