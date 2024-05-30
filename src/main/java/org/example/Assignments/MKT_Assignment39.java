package org.example.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

// Copy the value of one array into another array
// Copy the value of one array into another array and reverse the second array

public class MKT_Assignment39 {
    public static void main(String[] args) {
        String name [] =new String[4];
        name[0] ="Ram";
        name[1] ="Sita";
        name[2] ="Kajal";
        name[3] ="Kamini";
        String namecopy[] =new String[name.length];
        for(int i =0;i<name.length;i++){
            namecopy[i] =name[i];
        }
        System.out.println(Arrays.toString(name));

        System.out.println(Arrays.toString(namecopy));
    }
}
