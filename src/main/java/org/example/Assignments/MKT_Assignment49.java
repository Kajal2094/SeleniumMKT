package org.example.Assignments;
//Write a assertion program when
//name has empty string, some error should be thrown with the assertion message as well
public class MKT_Assignment49 {
    public static void main(String[] args) {
        String name = "";
        assert name.length()>0: "The length does not match";
        System.out.println(name.concat("a"));

    }

}
