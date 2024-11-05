package com.icolor.bitmanipulation;

import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        List<Integer> a = new ArrayList<>();

        while(num>1) {
            a.add(num%2);
            num=num/2;
        }
        a.add(num);
        Collections.reverse(a);
        for(int e : a)
            System.out.print(e+" ");
    }
}
