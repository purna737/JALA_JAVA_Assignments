package com.jala.thisandsuper;

public class Q1_ThisKeyword {

    int number = 100;
    String name = "Purna";

    void display() {

        // Using this keyword
        System.out.println("Using this:");
        System.out.println("Number: " + this.number);
        System.out.println("Name: " + this.name);

        // Without using object explicitly
        System.out.println("Without using object:");
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Q1_ThisKeyword obj = new Q1_ThisKeyword();

        obj.display();
    }
}