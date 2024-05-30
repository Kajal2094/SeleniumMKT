package org.example.Assignments;
//Program to do add,sub,mul,mod using global variable
public class MKT_Assignment9 {
    static int a = 100; //GV
    static int b = 23; //GV
    static int sum;
    static int mul;
    static int div;
    static int mod;
    static int sub;


    public static void add()
    {
        sum = a+b;
        System.out.println("The addition of two numbers are: " + sum);
    }

    public static void mul()
    {
        mul = a*b;
        System.out.println("The mul of two numbers are: " + mul);
    }


    public static void sub()
    {
        sub = a-b;
        System.out.println("The sub of two numbers are: " + sub);
    }


    public static void div()
    {
        div = a/b;
        System.out.println("The div of two numbers are: " + div);
    }


    public static void mod()
    {
        mod = a%b;
        System.out.println("The mod of two numbers are: " + mod);
    }


    public static void main(String[] args) {
     add();
     mul();
     div();
     mod();
     sub();

    }
}