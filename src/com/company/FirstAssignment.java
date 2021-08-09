package com.company;

import java.util.Scanner;

public class FirstAssignment {
    public static void main(String[] args) {
        System.out.println("Hello To Students System...");
        System.out.println("--- please Start Enter the User Data ---");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student1 name");
        String student1 = input.next();
        System.out.println("Enter student2 name");
        String student2 = input.next();
        System.out.println("Enter student3 name");
        String student3 = input.next();
        System.out.println("Enter student4 name");
        String student4 = input.next();
        System.out.println("Enter student5 name");
        String student5 = input.next();
        System.out.println("please enter student1 " +student1 + "mark for math");
        int student1math = input.nextInt();
        System.out.println("please enter student1 " +student1 + "mark for science");
        int student1science = input.nextInt();
        System.out.println("please enter student1 " +student1 + "mark for english");
        int student1english = input.nextInt();

        System.out.println("please enter student1 " +student2 + "mark for math");
        int student2math = input.nextInt();
        System.out.println("please enter student1 " +student2 + "mark for science");
        int student2science = input.nextInt();
        System.out.println("please enter student1 " +student2 + "mark for english");
        int student2english = input.nextInt();

        System.out.println("please enter student1 " +student3 + "mark for math");
        int student3math = input.nextInt();
        System.out.println("please enter student1 " +student3 + "mark for science");
        int student3science = input.nextInt();
        System.out.println("please enter student1 " +student3 + "mark for english");
        int student3english = input.nextInt();

        System.out.println("please enter student1 " +student4 + "mark for math");
        int student4math = input.nextInt();
        System.out.println("please enter student1 " +student4 + "mark for science");
        int student4science = input.nextInt();
        System.out.println("please enter student1 " +student4 + "mark for english");
        int student4english = input.nextInt();

        System.out.println("please enter student1 " +student5 + "mark for math");
        int student5math = input.nextInt();
        System.out.println("please enter student1 " +student5 + "mark for science");
        int student5science = input.nextInt();
        System.out.println("please enter student1 " +student5 + "mark for english");
        int student5english = input.nextInt();

        System.out.println("student 1 "+ student1 + "marks" + "" + "math:" + student1math + "science" + student1science
        +"english" + student1english);

        System.out.println("student 2 "+ student2 + "marks" + "" + "math:" + student2math + "science" + student2science
                +"english" + student2english);

        System.out.println("student 3 "+ student3 + "marks" + "" + "math:" + student3math + "science" + student3science
                +"english" + student3english);

        System.out.println("student 4 "+ student4 + "marks" + "" + "math:" + student4math + "science" + student4science
                +"english" + student4english);

        System.out.println("student 5 "+ student5 + "marks" + "" + "math:" + student5math + "science" + student5science
                +"english" + student5english);

        double min1 ;
        if (student1math <= student1english && student1math <= student1science)
        {   min1 = student1math ; }
        else if (student1english <= student1math && student1english <= student1science)
        {min1 = student1english ;}
        else {min1 = student1science ;}

        double max1 ;
        if (student1math >= student1english && student1math >= student1science)
        {   max1 = student1math ; }
        else if (student1english >= student1math && student1english >= student1science)
        {max1 = student1english ;}
        else {max1 = student1science ;}

        double avg1 = student1english + student1math + student1science / 3 ;
        System.out.println("student 1 "+ student1 + "marks" + "" + "math:" + student1math + "science" + student1science
                +"english" + student1english + "min mark :" + min1 + "max mark : " + max1 + "avg = " + avg1);



        double min2 ;
        if (student2math <= student2english && student2math <= student2science)
        {   min2 = student2math ; }
        else if (student2english <= student2math && student2english <= student2science)
        {min2 = student2english ;}
        else {min2 = student2science ;}

        double max2 ;
        if (student2math >= student2english && student2math >= student2science)
        {   max2 = student2math ; }
        else if (student2english >= student2math && student2english >= student2science)
        {max2 = student2english ;}
        else {max2 = student2science ;}

        double avg2 = student2english + student2math + student2science / 3 ;
        System.out.println("student 2 "+ student2 + "marks" + "" + "math:" + student2math + "science" + student2science
                +"english" + student2english + "min mark :" + min2 + "max mark : " + max2 + "avg = " + avg2);


        double min3 ;
        if (student3math <= student3english && student3math <= student3science)
        {   min3 = student3math ; }
        else if (student3english <= student3math && student3english <= student3science)
        {min3 = student3english ;}
        else {min3 = student3science ;}

        double max3 ;
        if (student3math >= student3english && student3math >= student3science)
        {   max3 = student3math ; }
        else if (student3english >= student3math && student3english >= student3science)
        {max3 = student3english ;}
        else {max3 = student3science ;}

        double avg3 = student3english + student3math + student3science / 3 ;
        System.out.println("student 3 "+ student3 + "marks" + "" + "math:" + student3math + "science" + student3science
                +"english" + student3english + "min mark :" + min3 + "max mark : " + max3 + "avg = " + avg3);


        double min4 ;
        if (student4math <= student4english && student4math <= student4science)
        {   min4 = student4math ; }
        else if (student4english <= student4math && student4english <= student4science)
        {min4 = student4english ;}
        else {min4 = student4science ;}

        double max4 ;
        if (student4math >= student4english && student4math >= student4science)
        {   max4 = student4math ; }
        else if (student4english >= student4math && student4english >= student4science)
        {max4 = student4english ;}
        else {max4 = student4science ;}

        double avg4 = student4english + student4math + student4science / 3 ;
        System.out.println("student 4 "+ student4 + "marks" + "" + "math:" + student4math + "science" + student4science
                +"english" + student4english + "min mark :" + min4 + "max mark : " + max4 + "avg = " + avg4);


        double min5 ;
        if (student5math <= student5english && student5math <= student5science)
        {   min5 = student5math ; }
        else if (student5english <= student5math && student5english <= student5science)
        {min5 = student5english ;}
        else {min5 = student5science ;}

        double max5 ;
        if (student5math >= student5english && student5math >= student5science)
        {   max5 = student5math ; }
        else if (student5english >= student5math && student5english >= student5science)
        {max5 = student5english ;}
        else {max5 = student5science ;}

        double avg5 = student5english + student5math + student5science / 3 ;
        System.out.println("student 5 "+ student5 + "marks" + "" + "math:" + student5math + "science" + student5science
                +"english" + student5english + "min mark :" + min5 + "max mark : " + max5 + "avg = " + avg5);

        
    }
}
