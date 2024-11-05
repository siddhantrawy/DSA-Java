package com.icolor.bitmanipulation;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if((num&1)==0)
            System.out.println(num+" is an even number.");
        else if((num&1)==1)
            System.out.println(num+" is an odd number.");

    }
}
