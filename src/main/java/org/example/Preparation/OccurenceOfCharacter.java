package org.example.Preparation;
//write a program in Java which prints the number of
// occurrences of each character in a string.
import java.util.*;
public class OccurenceOfCharacter {
// Hashmap is an unordered map , similar to hashset
    public static void characterCount(String inputString) {
        HashMap<Character, Integer> charcountMap = new HashMap<>();
        char[] Array = inputString.toCharArray();
        for (char c : Array)
        {
            if (charcountMap.containsKey(c))
            {
                charcountMap.put(c, charcountMap.get(c)+1);
            }
            else {
                charcountMap.put(c,1);
            }
        }
        for (Map.Entry entry : charcountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args) {
        String str = "GeeksForGeeks";
       characterCount(str);
    }
}