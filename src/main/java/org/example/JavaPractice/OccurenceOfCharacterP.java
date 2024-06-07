package org.example.JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacterP {

    public static void characterCount(String inputString)
    {
      HashMap<Character, Integer> mapOfCount = new HashMap<>();
      char [] Array = inputString.toCharArray();
      for (char c : Array)
      {
          if (mapOfCount.containsKey(c))
          {
              mapOfCount.put(c, mapOfCount.get(c)+1);
          }
          else {
              mapOfCount.put(c,1);
          }
      }
      for (Map.Entry entry : mapOfCount.entrySet())
      {
          System.out.println(entry.getKey() + " " +entry.getValue());
      }

    }

    public static void main(String[] args) {
        String str = "KajalSinghRajput";
        characterCount(str);
    }

}