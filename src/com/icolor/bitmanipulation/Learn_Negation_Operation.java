package com.icolor.bitmanipulation;

import java.util.Scanner;

public class Learn_Negation_Operation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Negation operation on "+num+" = " +(~num));
    }
}
