package org.example.Assignments;
// In the given array find out if 41 is present or not
public class MKT_Assignment37 {
    public static void main(String[] args) {
int nos[] =new int[4];
        nos[0] =41;
        nos[1] =41;
        nos[2] =65;
        nos[3] =12;
        int givenno =41;
        for (int i =0;i<nos.length;i++)
        {
            if(givenno ==nos[i])
            {
                System.out.println("Number is present in the array");
            }
            else
            {
                System.out.println("Number is not present");
            }
        }
    }
}
