package org.example.Assignments;

//Create Constructor overloading  programn atleast one constructor have seven parameters in it

public class MKT_Assignment6 {
    MKT_Assignment6()
    {
        System.out.println("First constructor");
    }
    MKT_Assignment6(String string, int i, boolean b, float f, double d, long l, int Int)
    {
        System.out.println("Second constructor with 7 parameters: " + string + ", " + i + ", " + b + ", " + f + ", " + d + ", " + l + ", " + Int);
    }

    public static void main(String[] args)
    {
        new MKT_Assignment6();
        new MKT_Assignment6("a", 1, true, 2.55f, 2.33, 122222, 11);

    }

}

