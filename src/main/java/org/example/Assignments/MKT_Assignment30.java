package org.example.Assignments;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
// Get the array from scanner class and compare with each other using equals function
public class MKT_Assignment30 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rollno[] = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the array element 1----->" +i );
                rollno[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(rollno));

            int rollno1[] = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the array element 2 ----->" +i );
                rollno1[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(rollno1));
        if (Arrays.equals(rollno, rollno1)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        }

    }

