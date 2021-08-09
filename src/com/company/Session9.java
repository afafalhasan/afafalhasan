package com.company;
import java.util.Scanner;
public class Session9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a letter");
        char chara = input.next().charAt(0);
        switch (chara) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("ballon");
                break;
            default:
                System.out.println("nothing");
        }
    }
}