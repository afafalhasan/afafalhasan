package com.company;

import java.util.Scanner;

public class BooleanAndInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number ");
        int num = input.nextInt();
        int count = 1;
        while (count <= 10) {
            System.out.println(num + "*" + count + "=" + num * count);
            count++;
        }
    }
}