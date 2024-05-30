package org.example.Assignments;
//How to get date in the given format
//15 Apr 2024
// 15-Apr-2024
// 15/Apr/2024

import java.util.Date;

public class MKT_Assignment24 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        String input = d1.toString();
        String date = input.substring(4,7);
        System.out.println(date);
        String month = input.substring(8,10);
        System.out.println(month);
        String year = input.substring(input.length()-4);
        System.out.println(year);
        System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
        System.out.println(date.concat("-").concat(month).concat("-").concat(year));
        System.out.println(date.concat("/").concat(month).concat("/").concat(year));


    }
}
