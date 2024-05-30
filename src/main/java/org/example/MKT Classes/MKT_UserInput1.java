package org.example;

import java.util.Scanner;

public class MKT_UserInput1 {

    static void add (){
        System.out.println("Taking input from the user for addition");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("a+b=" +sum);
    }

    static void mul (){
        System.out.println("Taking input from the user for multiplication");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int c = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int d = sc.nextInt();
        int mul = c*d;
        System.out.println("c*d=" +mul);
    }
    static void div (){
        System.out.println("Taking input from the user for division");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int c = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int d = sc.nextInt();
        int div = c/d;
        System.out.println("c/d=" +div);
    }

    static void sub (){
        System.out.println("Taking input from the user for subtraction");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int c = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int d = sc.nextInt();
        int sub = c-d;
        System.out.println("c-d=" +sub);
    }
    static void mod (){
        System.out.println("Taking input from the user for modulus");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Value");
        int c = sc.nextInt();
        System.out.println("Enter 2nd Value");
        int d = sc.nextInt();
        int mod = c%d;
        System.out.println("c%d=" +mod);
    }


    public static void main(String[] args) {
   add();
   mul();
   sub();
   div();
   mod();
    }
}
