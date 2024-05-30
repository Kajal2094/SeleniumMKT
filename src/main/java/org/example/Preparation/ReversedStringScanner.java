package org.example.Preparation;

import java.util.Scanner;

public class ReversedStringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any string: ");
        String a = sc.nextLine();
        for (int i =a.length()-1;i>=0;i--)
        {
            System.out.print(a.charAt(i));
        }

    }
}
