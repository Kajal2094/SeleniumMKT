package org.example.Assignments;

import java.util.Arrays;

//// In a string "Manish Kumar Tiwari", Find out the spaces involved
public class MKT_Assignment34 {
    static int space= 0;
    public static void main(String[] args) {
        String name ="Manish Kumar Tiwari";
        char [] c1 = name.toCharArray();
        System.out.println(Arrays.toString(c1));
        for(int i =0;i<c1.length;i++)
        {
            boolean answer = Character.isSpaceChar(c1[i]);
            if (answer ==true)
            {
                space++;
            }
        }

        System.out.println(space);

    }

}
