package org.example.Assignments;

import java.util.Scanner;
//Arithmetic Operation using Human input

public class MKT_Assignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a number");
        Float a =sc.nextFloat();
        System.out.println("Enter your b number");
        Float b =sc.nextFloat();
        System.out.println("Enter your c number");
        Float c =sc.nextFloat();
        Float sum = a+b+c;
        System.out.println("Sum of a, b and c is: "+sum);
    }
}

