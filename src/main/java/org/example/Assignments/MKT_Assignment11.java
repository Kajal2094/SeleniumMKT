package org.example.Assignments;
//Find the area and circumference of the circle using final variable concept
public class MKT_Assignment11 {
    public static void main(String[] args) {
        final double pie = 3.14;
        final int r = 5;
        double circumference = 2*pie*r;
        double area = pie*(r*r);
        System.out.println(circumference);
        System.out.println(area);

    }
}
