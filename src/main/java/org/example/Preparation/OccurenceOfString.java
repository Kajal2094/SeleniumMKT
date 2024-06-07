package org.example.Preparation;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {
    public static void StringCount(String inputString)
    {
        HashMap<String, Integer> countOfword = new HashMap<>();
        String[] Array = inputString.split("\\s+");
     for (String word : Array)
    {
        word= word.toLowerCase();
        if (countOfword.containsKey(word))
        {
            countOfword.put(word,countOfword.get(word) +1);
        }
        else {
            countOfword.put(word,1);
        }
    }
    for(Map.Entry entry : countOfword.entrySet())
    {
        System.out.println(entry.getKey()+" " +entry.getValue());
    }

    }

    public static void main(String[] args) {
        String str = "This this is my first and First program";
        StringCount(str);
    }
}
