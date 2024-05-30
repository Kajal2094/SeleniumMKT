package org.example.Assignments;

// order of execution when we have MM,IIB,SIB,constructor

public class MKT_Assignment14 {

    public static void main(String[] args) //main method

    {
        System.out.println("main method");
        MKT_Assignment14 p1 = new MKT_Assignment14();
    }
    MKT_Assignment14()   //constructor

    {

        System.out.println("constructor");
    }

    static   //SIB

    {
        System.out.println("SIB");
    }
    static   //SIB

    {
        System.out.println("SIB2");
    }

    //IIB
    {
        System.out.println("IIB");
    }

    //IIB

        {
        System.out.println("IIB2");
    }
}
