package org.example;

public class ThisCallingStatement {
    ThisCallingStatement(){
        this(1.22);
        System.out.println("First constructor"); // this will be executed third
    }
    ThisCallingStatement(int a){

        System.out.println("Second constructor"); // this will be executed second
    }
    ThisCallingStatement(double b){

        System.out.println("Third constructor");// this will be executed first
    }
    ThisCallingStatement(String c){


        System.out.println("Fourth constructor");
    }

    public static void main(String[] args) {
        ThisCallingStatement m1 =new ThisCallingStatement();
    }
}
