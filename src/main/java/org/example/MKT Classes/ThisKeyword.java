package org.example;

public class ThisKeyword {
    int age;
    String name;
    double salary;
    void student_detail(int age, String name, double salary)
    {
        this.age =age;
        this.name =name;
        this.salary =salary;
    }

    public static void main(String[] args) {

        ThisKeyword k =new ThisKeyword();
        k.student_detail(90,"ram", 222.3);
        System.out.println(k.name);
        System.out.println(k.age);
        System.out.println(k.salary);
    }
}
