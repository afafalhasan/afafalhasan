package com.company;

public class TestChapter3 {
        public static void main(String[] args) {
            java.util.Scanner input = new java.util.Scanner(System.in);
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            System.out.println((x < y && y < z) ?
                    "sorted" : "not sorted");
        }
    }

