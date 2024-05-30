package org.example.Preparation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a = "bread";
        String b = "beard";
        char [] a1 = a.toCharArray();
        char [] b1 = b.toCharArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));
        if (b1.length == a1.length)
        {
            System.out.println("This is anagram");
        }

        Arrays.sort(a1);
        Arrays.sort(b1);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));

    }
}
