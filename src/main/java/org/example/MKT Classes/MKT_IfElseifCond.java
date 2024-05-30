package org.example;

public class MKT_IfElseifCond {
    public static void main(String[] args) {
        int f = 10;
        int m = 9;
        int c = 8;
        char gender1 = 'm';
        char gender2 = 'f';
        char gender3 = 'c';
        if (gender1==m)
        {
            System.out.println("He has to pay 10rs");
        }
        else if (gender2==f)
        {
            System.out.println("She has to pay 9rs");
        }
        else
        {
            System.out.println("Person has to pay 8rs");
        }
    }
}
