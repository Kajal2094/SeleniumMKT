package org.example.Assignments;
//Program to write both static and non-static method  in a class
public class MKT_Assignment4 {
    static void addition(){
        System.out.println("Addition");
    }
    public void multiplication(){
        System.out.println("Multiplication");
    }

    public static void main(String[] args) {
        MKT_Assignment4 a1 = new MKT_Assignment4();
        a1.multiplication();
        addition();

    }
}
