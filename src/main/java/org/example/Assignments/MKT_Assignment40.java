package org.example.Assignments;

import java.util.Arrays;

// Find out if the two given string is anagram of each other
public class MKT_Assignment40{

    public static void main(String[] args) {
        String input1 = "bread";
        String input2 = "be2ard";
        if (input1.length()!= input2.length())
        {
            System.out.println("this is not anagram");
        }
        else {
        char [] c1 = input1.toCharArray();
        char [] c2 = input2.toCharArray();
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        if (Arrays.equals(c1,c2)== true)
        {
            System.out.println("They are anagram");
        }
        else
        {
            System.out.println("They are not anagram");
        }
    }
}}
