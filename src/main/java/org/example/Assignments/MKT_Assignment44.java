package org.example.Assignments;
// create an array of size 4 of int data type and find out the average value of array
//
public class MKT_Assignment44 {
    static double average =0;
    static int sum =0;
    public static void main(String[] args) {
      // int a = 20;
      //  int b = 30;
      //  int c = 40;
        int number [] = new int[4];
        number[0] = 14;
        number[1] = 15;
        number[2] = 15;
        number[3] = 15;
        for(int i =0;i<number.length;i++)
        {
            sum = number[i] + sum;
            average = sum/ number.length;

        }
        System.out.println(average);
    }
}
