package org.example.Assignments;
//// Print your name in the vertical manner but in reverse order
public class MKT_Assignment21 {
    public static void main(String[] args) {
        String name = "KAJAL";
        for(int i =name.length()-1;i>=0;i--)
        {
            char a1 = name.charAt(i);
            System.out.println(a1);
        }
    }
}
