package org.example.Assignments;
// Create constructor overloading  program atleast one constructor have one parameters in it
public class MKT_Assignment5 {
    MKT_Assignment5()
    {
        System.out.println("First Constructor");
    }
    MKT_Assignment5(String s){
        System.out.println("Second Constructor is : " + s);
    }

    public static void main(String[] args) {
        new MKT_Assignment5();
        new MKT_Assignment5("KAJAL");
    }
}
