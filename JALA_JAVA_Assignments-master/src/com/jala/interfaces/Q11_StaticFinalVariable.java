package com.jala.interfaces;

interface Q11_Interface {

    static final int NUMBER = 100;
    static final String NAME = "Purna";

    void display();
}

public class Q11_StaticFinalVariable implements Q11_Interface {

    @Override
    public void display() {
        System.out.println("Interface method called");
    }

    public static void main(String[] args) {

        Q11_StaticFinalVariable obj =
                new Q11_StaticFinalVariable();

        // Accessing static final variables
        System.out.println("Number: " + Q11_Interface.NUMBER);
        System.out.println("Name: " + Q11_Interface.NAME);

        // Calling interface method
        obj.display();
    }
}