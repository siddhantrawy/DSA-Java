package com.icolor.bitmanipulation;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Learn_RightShift_Operation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Right shift operation on "+num+" = " +(num>>2));
    }
}
