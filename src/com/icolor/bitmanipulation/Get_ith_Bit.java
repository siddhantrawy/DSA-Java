package com.icolor.bitmanipulation;

import java.util.Scanner;

public class Get_ith_Bit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter value of i: ");
        int i = input.nextInt();

        int res = num&(1<<(i-1));
        if(res>0)
            System.out.println("The "+i+" position bit = 1");
        else if(res==0)
            System.out.println("The "+i+" position bit = 0");
    }
}
