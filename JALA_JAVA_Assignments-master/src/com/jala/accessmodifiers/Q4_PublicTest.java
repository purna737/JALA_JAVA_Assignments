package com.jala.accessmodifiers;

public class Q4_PublicTest {

    public static void main(String[] args) {

        Q4_PublicAccess obj = new Q4_PublicAccess();

        // Accessing public fields
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        // Accessing public method
        obj.display();
    }
}