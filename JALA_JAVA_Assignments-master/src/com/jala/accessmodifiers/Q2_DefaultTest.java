package com.jala.accessmodifiers;

public class Q2_DefaultTest {

    public static void main(String[] args) {

        Q2_DefaultAccess obj = new Q2_DefaultAccess();

        // Accessing default fields from another class
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        // Accessing default method from another class
        obj.display();
    }
}