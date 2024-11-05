package com.icolor.bitmanipulation;

import java.util.Scanner;

public class CountSetBits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;

        while(num>0) {
            if((num&1)==1)
                count++;
            num=num>>1;
        }
        System.out.println("Number of set bits = "+count);


    }
}
