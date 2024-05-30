package org.example.Assignments;
//Write a program with help of String functions .length, charAt(), .concat(), .contains(), .touppercase(), .tolowercase() etc
public class MKT_Assignment18 {
    public static void main(String[] args) {
        String name = "KAJAL";
        System.out.println(name.length()); // size of the string
        System.out.println(name.charAt(2)); // index of 2nd char
        System.out.println(name.indexOf('L')); // Index of L char
        System.out.println(name.toUpperCase()); // change it to upper case
        System.out.println(name.toLowerCase()); // change it to lower case
        System.out.println(name.concat(" is my name")); //  concatenating
        String First_name = "Vishal";
        String last_name = "Singh";
        System.out.println(First_name.concat(" ").concat(last_name)); //  concatenating
        System.out.println(name.contains("KAJ")); //  concatenating


    }

}
