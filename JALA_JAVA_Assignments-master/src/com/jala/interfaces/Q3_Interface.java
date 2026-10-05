package com.jala.interfaces;


public class Q3_Interface implements MyInterface {

    @Override
    public void display() {
        System.out.println("Interface method implemented successfully");
    }

    public static void main(String[] args) {

        Q3_Interface obj = new Q3_Interface();

        obj.display();
    }
}