package com.icolor.bitmanipulation;

import java.util.Scanner;

public class Learn_AND_Operation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("AND operation on "+num1+" and "+num2+" = " +(num1&num2));
    }
}
