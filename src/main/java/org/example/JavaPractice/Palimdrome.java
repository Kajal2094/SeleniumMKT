package org.example.JavaPractice;

public class Palimdrome {
    public static void main(String[] args) {
        String name = "mom";
        String reversed = new StringBuilder(name).reverse().toString();
        if(name.equalsIgnoreCase(reversed))
        {
            System.out.println("It is palimdrome");
        }
        else
        {
            System.out.println("It is not palimdrome");
        }
    }
}
