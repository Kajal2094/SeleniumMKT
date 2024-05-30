package org.example.Assignments;

import java.util.Arrays;

// In a string "Kajal" . Find out number of  letters involved
public class MKT_Assignment32 {
    static int countofalpha =0;
    public static void main(String[] args) {
        String name = "KAJAL SGY12344";
        char [] c1 = name.toCharArray();
        System.out.println(Arrays.toString(c1));
        for (int i =0; i<c1.length;i++)
        {
            boolean answer = Character.isAlphabetic(c1[i]);
            if (answer == true)
            {
                countofalpha ++;
            }
        }
        System.out.println("The total count of alphabets in the mentioned string: " +countofalpha);
    }
}