package org.example.Assignments;
// Print arrays of three strings and roll number
public class MKT_Assignment26 {
    public static void main(String[] args) {
        String name [] =new String[3];
        int roll [] = new int [3];
        name [0] ="KAJAL";
        name [1] ="Manish";
        name [2] ="Golu";
        roll [0] = 1;
        roll [1] = 2;
        roll [2] = 3;

        System.out.println("Student name" +"Role number");
        for (int i =0; i<3;i++)
        {
            System.out.println(name[i] +" " + roll[i]);
        }
    }
}
