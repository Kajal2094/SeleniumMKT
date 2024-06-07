package org.example.JavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapForEach {
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
            for(Map.Entry<String, Integer>a: map.entrySet())
            {
                System.out.println(a.getKey() +" "+ a.getValue());

            }
        Set<String> keys =map.keySet();
            for(String key : keys){
                System.out.println(key+  " " +map.get(key));
            }
map.remove("China");
        System.out.println(map);

        }
}
