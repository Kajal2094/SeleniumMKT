package org.example.Assignments;
// In a string "Manish123", Find out the numeric values involved

import java.util.Arrays;

public class MKT_Assignment33 {
    static int countofnumeric =0;
    public static void main(String[] args) {
        String name ="Manish123";
        char [] c1 =name.toCharArray();
        System.out.println(Arrays.toString(c1));
        for (int i =0; i< c1.length;i++)
        {
boolean answer =Character.isDigit(c1[i]);
if (answer ==true){
    countofnumeric++;
}
        }
        System.out.println(countofnumeric);
    }

}
