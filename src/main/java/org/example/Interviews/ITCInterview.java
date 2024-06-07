package org.example.Interviews;

import java.util.HashSet;
import java.util.Set;

public class ITCInterview {
    public static void main(String args[]) {
        int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        Set<Integer> seen = new HashSet<>();
        Set <Integer> duplicates = new HashSet<>();
        for (int element :arr)
        {
            if (!seen.add(element))
            {
                duplicates.add(element);
            }
        }
        System.out.print ("Duplicate elements : " + duplicates);
    }


}
