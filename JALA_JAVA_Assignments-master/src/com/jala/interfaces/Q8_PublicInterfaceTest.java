package com.jala.interfaces;

interface Q8_PublicInterface {

    int NUMBER = 100;
    String NAME = "Purna";

    void display();
}


public class Q8_PublicInterfaceTest implements Q8_PublicInterface {

    @Override
    public void display() {
        System.out.println("Interface method called");
    }

    public static void main(String[] args) {

        Q8_PublicInterfaceTest obj = new Q8_PublicInterfaceTest();

        // Printing interface fields
        System.out.println("Number: " + Q8_PublicInterface.NUMBER);
        System.out.println("Name: " + Q8_PublicInterface.NAME);

        // Calling interface method
        obj.display();
    }
}