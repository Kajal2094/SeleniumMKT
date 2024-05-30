package org.example.Assignments;
// WAP to get the palidrome of a string
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main (String[]args) {
        String name = "mom";
        String reversedName = new StringBuilder(name).reverse().toString();
        if (reversedName.equalsIgnoreCase(name))
        {
            System.out.println("Palimdrome");
        }
        else
        {
            System.out.println("Not Palimdrome");

        }
    }
}