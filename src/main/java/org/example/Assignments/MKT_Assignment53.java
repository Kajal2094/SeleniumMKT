package org.example.Assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner s1= new Scanner(System.in)
//int n1= s1.nextint();
//String name= new String[n1];
//name[0]="Ram";
//name[1]="Sita";
//name[2]="Laxman";
//name[3]="Hanuman";
//if the user enter entered n1= 3,
//if the user enter entered n1= manish,
//
//Handel those exceptions by try and catch block.
public class MKT_Assignment53 {
    public static void main(String[] args) {

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter any value");
        int n1 = s1.nextInt();
        String [] name = new String[4];
        name[0]="Ram";
        name[1]="Sita";
        name[2]="Laxman";
        name[3]="Hanuman";

        try {
            if (n1 ==4) {

            }
        } catch(InputMismatchException e ) {
            System.out.println("Error thrown");
        }

        catch(ArrayIndexOutOfBoundsException e ) {
            System.out.println("Error thrown");
        }
        catch(StringIndexOutOfBoundsException e ) {
            System.out.println("Error thrown");
        }
        catch(ArithmeticException e ) {
            System.out.println("Error thrown");
        }

    }
}