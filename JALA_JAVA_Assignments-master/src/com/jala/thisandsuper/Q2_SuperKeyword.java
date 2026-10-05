package com.jala.thisandsuper;

class Parent {

    int number = 100;
    String name = "Parent";
}

public class Q2_SuperKeyword extends Parent {

    int number = 200;
    String name = "Child";

    void display() {

        System.out.println("Parent number: " + super.number);
        System.out.println("Parent name: " + super.name);

        System.out.println("Child number: " + this.number);
        System.out.println("Child name: " + this.name);
    }

    public static void main(String[] args) {

        Q2_SuperKeyword obj = new Q2_SuperKeyword();

        obj.display();
    }
}