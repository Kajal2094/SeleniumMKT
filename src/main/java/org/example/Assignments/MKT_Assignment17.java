package org.example.Assignments;

//Using Math.random() get the radius of 10 circles & find the area of each circle
public class MKT_Assignment17 {
    public static void main(String[] args) {
        double pi = (double)Math.PI;
        for( int i=0; i<10;i++)
        {
            double radius = Math.random() * 10;
            System.out.println("Radius: " + (i + 1) + ": " + radius);
            double area = Math.PI * radius * radius;
            System.out.println("Area: " + (i + 1) + ": " + area);

        }

    }

}
