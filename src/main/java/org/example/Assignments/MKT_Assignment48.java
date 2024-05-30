package org.example.Assignments;
//Write a assertion program when
//name has empty string, some error should be thrown
public class MKT_Assignment48 {
    public static void main(String[] args) {
        String name = "";
        assert name.length()>0;
        System.out.println(name.concat("a"));

    }
}
