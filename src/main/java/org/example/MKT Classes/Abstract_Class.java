package org.example;
abstract class MKT_AbstractClass {

    abstract void un(); // abstract method

    abstract void un_mob(); // abstract method

    void login_button() { // concrete method
        System.out.println("Logic ");
    }
}

abstract class AmazonLogin extends MKT_AbstractClass {

    abstract void un_asemail(); // abstract method

    abstract void un_mob_as(); // abstract method

    void registrationbutton() { // concrete method
        System.out.println("Logic2");
    }
}

public class Abstract_Class extends AmazonLogin {

    static void login_page() {
        System.out.println("Logic1");
    }

    public static void main(String[] args) {
    Abstract_Class a1 = new Abstract_Class();
    }

    @Override
    void un() {

    }

    @Override
    void un_asemail() {

    }

    @Override
    void un_mob() {

    }

    @Override
    void un_mob_as() {

    }
}

