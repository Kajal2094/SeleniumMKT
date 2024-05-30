package org.example.Assignments;

import java.util.Scanner;

// Find out the given string is palimdrome or not?
public class MKT_Assignment36 {
    public static void main(String[] args) {
        String name = "NAINA";
        char [] c1 = name.toCharArray();
        System.out.println(c1);
        for (int i =name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));

        }
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        {
            System.out.println(i);
        }

    }
}
