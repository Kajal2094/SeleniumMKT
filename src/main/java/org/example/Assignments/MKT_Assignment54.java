package org.example.Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

// try , catch and finally keyword usage in one program
public class MKT_Assignment54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid input");
        try {

            int n1 = sc.nextInt();

        }
        catch(InputMismatchException e)
        {
            System.out.println("Exception occurred");
        }
        finally {
            System.out.println("Thankyou for running the program");
        }
    }
}
