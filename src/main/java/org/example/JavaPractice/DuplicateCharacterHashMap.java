package org.example.JavaPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterHashMap {

    public static void characterDuplicate(String inputString){
        HashMap<Character, Integer> mapofCount = new HashMap<>();
        char [] Array = inputString.toCharArray();
        for (char c : Array)
        {
            if (mapofCount.containsKey(c))
            {
                mapofCount.put(c,mapofCount.get(c) +1)  ;

            }
            else {
                mapofCount.put(c,1);

            }
        }
        for (HashMap.Entry<Character, Integer> entry : mapofCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        characterDuplicate(str);
    }
}
