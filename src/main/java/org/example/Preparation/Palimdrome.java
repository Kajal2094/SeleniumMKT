package org.example.Preparation;

public class Palimdrome {
    public static void main(String[] args) {
        String name = "Nitin";
        String reversedname = new StringBuilder(name).reverse().toString();

        if (name.equalsIgnoreCase(reversedname))
        {
            System.out.println("Palimdrome it is ");
        }
        else {
            System.out.println("Not Palimdrome");
        }
    }
}
