package org.example.Assignments;

import java.util.Date;

// how to get past day and future day

public class MKT_Assignment25 {
    public static void main(String[] args) {
        Date d1 = new Date();
        String input = d1.toString();
        String  input1 = input + (60*60*1000*24*6);
        System.out.println(input1+60*60*1000*24*6);

    }
}
