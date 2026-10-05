package com.jala.abstractclass;

abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

public class Q3_AbstractMethod extends Vehicle {

    @Override
    void start() {
        System.out.println("Vehicle started");
    }

    public static void main(String[] args) {

        // Create an instance of child class
        Q3_AbstractMethod obj = new Q3_AbstractMethod();

        // Call abstract method implemented in child class
        obj.start();
    }
}