package org.example.Assignments;
// How to overload the main method

public class MKT_Assignment47 {
        public static void main(String[] args) {
            System.out.println("Main method");
        }

        public static void main(String arg) {
            System.out.println("Overloaded " + arg);
        }

        public static void main(int num) {
            System.out.println("Overloaded main method with int arg: " + num);
        }
    }