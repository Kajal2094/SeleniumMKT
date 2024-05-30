package org.example;

public class MKT_Inheritance {
    static void add(){
        System.out.println("addition");
    }
    static void mul(){
        System.out.println("multiplication");
    }
}
class child extends MKT_Inheritance{

    static void add(){
        System.out.println("addition");
    }
    static void mul(){
        System.out.println("multiplication");
    }

    public static void main(String[] args) {
        add();
        mul();
    }
}
