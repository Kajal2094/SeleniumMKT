package org.example.Assignments;

import java.util.Arrays;
import java.util.Scanner;
//  Print array with the help of to string function of array class
public class MKT_Assignment28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rollno[] = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the array element ----->" +i );
            rollno[i] = sc.nextInt();
            //  System.out.println("Entered value: " + rollno[i]);
        }
            System.out.println("Array elements: " + Arrays.toString(rollno));


    }

}