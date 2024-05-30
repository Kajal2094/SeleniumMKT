package org.example;
// How class 1 can call the class one constructor and how class 1 can call other class constructor

public class MKT_Constructor2ndClass {

    MKT_Constructor2ndClass() {
        System.out.println("MKT_Constructor2ndClass");
    }

    public static class InvokingConstructor {

        InvokingConstructor() {
            System.out.println("InvokingConstructor");
        }

        public static void main(String[] args) {
            new MKT_Constructor2ndClass();
            new InvokingConstructor();
        }
    }
}