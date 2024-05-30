package org.example;

class MKT_Supercallling {

    MKT_Supercallling(){
        System.out.println("College");
    }
}

class School extends MKT_Supercallling {

    School(int a, int b) {
        super();
        System.out.println("School");
    }
}

public class SuperCallingStatement_Class
{
    public static void main(String[] args) {
        School s1 = new School(100,44);
    }
}

