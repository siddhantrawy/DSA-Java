package com.icolor.bitmanipulation;

import java.util.Scanner;

public class Set_ith_Bit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter value of i: ");
        int i = input.nextInt();

        int res = num|(1<<(i-1));
        System.out.println("Number we get after set "+i+" position bit: "+res);

    }
}
