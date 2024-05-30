package org.example.Assignments;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
//// Get the array from scanner class of string data type and compare with each other using equals function
public class MKT_Assignment31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] =new  String[3];
        for (int i =0; i<3; i++)
        {
            System.out.println("Enter the students name for class 1---->" +i);
         name[i]= sc.nextLine();
        }
        System.out.println(Arrays.toString(name));
        String name2[] =new  String[3];
        for (int i =0; i<3; i++)
        {
            System.out.println("Enter the students name for class 2---->" +i);
            name2[i]= sc.nextLine();
        }
        System.out.println(Arrays.toString(name2));

        if (Arrays.equals(name,name2))
        {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not matched");
        }
    }
}
