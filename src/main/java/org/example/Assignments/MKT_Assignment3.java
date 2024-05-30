package org.example.Assignments;
// Write Nonstatic method Program for add,sub,mul,div,mod
public class MKT_Assignment3 {
    public void add(){
        System.out.println("Addition of non static method");
    }
    public void mul(){
        System.out.println("Multiplication of non static method");
    }
    public void sub(){
        System.out.println("Subtraction of non static method");
    }
    public void div(){
        System.out.println("Division of non static method");
    }
    public void mod(){
        System.out.println("Modulus of non static method");
    }

    public static void main(String[] args) {
        MKT_Assignment3 a1 = new MKT_Assignment3();
        a1.add();
        a1.mod();
        a1.mul();
        a1.sub();
        a1.div();

    }
}
