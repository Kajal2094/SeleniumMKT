package org.example.JavaPractice;

import java.util.HashMap;

public class Hashmap {
    // Hashmap is an unordered map , similar to hashset
    public static void main(String[] args) {
        //country (key) population  (value)
        HashMap<String,Integer> map = new HashMap<>();
        //Insertion operation
        map.put("India",120);
        map.put("China",200);
        map.put("US",444);
        map.put("Nepal",100);
        map.put("America",1002);
        map.put("Sri-Lanka",19);

        System.out.println(map);
        map.put("China",2);
        System.out.println(map);
        if(map.containsKey("China"))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Not present");
        }
        System.out.println(map.get("China"));// key exists
        System.out.println(map.get("Indo"));// key does not exists
    }

}
