package com.jala.abstractclass;


public class Q4_NonAbstractMethod extends Vehicle {

    @Override
    void start() {
        System.out.println("Vehicle started");
    }

    public static void main(String[] args) {

        // Create an instance of child class
        Q4_NonAbstractMethod obj = new Q4_NonAbstractMethod();

        // Calling non-abstract methods
        obj.stop();
        obj.fuel();
    }
}