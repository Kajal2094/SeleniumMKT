package org.example;

public class MKT_MultiInheritance {

    static void add(){
        System.out.println("add");

    }

 class Parent_Class extends MKT_MultiInheritance{
     static void mul(){
         System.out.println("mul");

     }
 }

    class Child_Class extends Parent_Class{
        public static void main(String[] args) {
            mul();
            add();

        }





    }
}
