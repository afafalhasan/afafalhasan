package com.company;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your ID");
        int id = input.nextInt();
        switch (id) {
            case 555:
                System.out.println("pls enter your password");
                int password = input.nextInt();
                switch (password){
                    case 123456:
                        System.out.println("wlc Yasser");
                        break;

                    default:
                        System.out.println("incorrect password");
                }
                break;

            default:
                System.out.println("not found");

        }
    }
}
