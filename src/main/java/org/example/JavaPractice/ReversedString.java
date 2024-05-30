package org.example.JavaPractice;

public class ReversedString {
    public static void main(String[] args) {
        String name = "kajal";
        for (int i =name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
