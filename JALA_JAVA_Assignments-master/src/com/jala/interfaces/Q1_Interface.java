package com.jala.interfaces;

interface MyInterface {

    void display();
}

public class Q1_Interface implements MyInterface {

    @Override
    public void display() {
        System.out.println("Interface method implemented successfully");
    }

    public static void main(String[] args) {

        Q1_Interface obj = new Q1_Interface();

        // Calling the implemented method
        obj.display();
    }
}