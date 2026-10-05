package com.jala.abstractclass;



public class Q2_AbstractChild extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {

        // Creating object of child class
        Q2_AbstractChild obj = new Q2_AbstractChild();

        // Calling abstract method implementation
        obj.sound();

        // Calling non-abstract method
        obj.eat();
    }
}