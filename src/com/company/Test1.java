package com.company;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 2 != 0) {
            System.out.println("Wired");
        } else if (n >= 2 && n <= 5) {
            System.out.println("not Wired");
        }
       else if (n >= 6 && n <= 20) {
            System.out.println(" Wired");
        }
        if (n > 20) {
            System.out.println(" not  Wired");
        }
    }
}


