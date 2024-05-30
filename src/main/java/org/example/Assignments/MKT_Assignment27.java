package org.example.Assignments;
import java.util.Arrays;
import java.util.Scanner;

// Create a array of datatype int of size
// 3 and takes the value of array using scanner class

public class MKT_Assignment27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollno[] = new int[3];
        for (int i =0; i<3;i++)
        {
            System.out.println("Enter the array" +i);
            rollno[i] = sc.nextInt();


        }
        System.out.println(Arrays.toString(rollno));

    }
}
