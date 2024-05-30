package org.example;

// Overload a constructor and make sure to have 7 parameters in one constructor.//


import java.io.PrintStream;

public class MKT_ConstructorOverloading {
    MKT_ConstructorOverloading()
    {
        System.out.println("First constructor");
    }
    MKT_ConstructorOverloading(String string, int i, boolean b, float f, double d, long l, int Int)
    {
        System.out.println("Second constructor with 7 parameters: " +string);
    }

    public static void main(String[] args)
    {
        new MKT_ConstructorOverloading();
        new MKT_ConstructorOverloading("a", 1, true, 2.55f, 2.33, 122222, 11);

    }

}
