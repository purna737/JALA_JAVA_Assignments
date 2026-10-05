package com.jala.interfaces;

public class Q2_Interface implements MyInterface {

    @Override
    public void display() {
        System.out.println("Interface method implemented successfully");
    }

    public static void main(String[] args) {

        // Interface reference
        MyInterface obj = new Q2_Interface();

        // Calling implemented method
        obj.display();
    }
}