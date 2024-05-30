package org.example.Assignments;

public class MKT_Assignment29 {
    abstract class Assignment14 {
        abstract void add();

        abstract void mul();
    }

    abstract class Assignment extends Assignment14 {
        abstract void div();

        abstract void mod();

        void login() {
            System.out.println("Non static concrete method");
        }

        void logout() {
            System.out.println("Non static concrete method");
        }
    }

    class Child extends Assignment {
        void search() {
            System.out.println("cm1");
        }

        void filter() {
            System.out.println("cm2");
        }

        public void main(String[] args) {
            Child c1 = new Child();
            c1.mul();
            c1.login();
            c1.logout();
            c1.search();
            c1.filter();
        }

        void add() {
            System.out.println("Abstract class implementation");
        }

        @Override
        void mul() {

        }

        void div() {
            System.out.println("Abstract class implementation");
        }

        void mod() {
            System.out.println("Abstract class implementation");
        }
    }
}