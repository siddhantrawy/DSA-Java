package com.icolor.bitmanipulation;

import java.util.Scanner;

public class IsNumberPowerOfTwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if((num&(num-1))==0)
            System.out.println("Number "+num+" is power of 2.");
        else if((num&(num-1))>0)
            System.out.println("Number "+num+" is not power of 2.");

    }
}
