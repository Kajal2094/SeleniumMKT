package org.example.Assignments;

// in the given string , school123 , replace all the alphabets
// my input is in capital letters, how to remove all the capital letters
//remove all the numeric value

public class MKT_Assignment43 {
    public static void main(String[] args) {
        String name = "school1234";
        String name1 = "School1234";
        String output =name.replaceAll("[a-z]","");
        String output1=name1.replaceAll("[A-Z]","");
        String output2 =name.replaceAll("[0-9]","");

        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
    }
}
