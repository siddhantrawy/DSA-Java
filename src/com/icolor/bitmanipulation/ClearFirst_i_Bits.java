package com.icolor.bitmanipulation;

import java.util.Scanner;

public class ClearFirst_i_Bits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter value of i: ");
        int i = input.nextInt();
        num=num>>i;
        num=num<<i;
        System.out.println("Number we get after clear last "+i+" position bit: "+num);
    }
}
