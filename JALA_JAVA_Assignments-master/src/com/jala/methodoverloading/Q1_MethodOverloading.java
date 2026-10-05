package com.jala.methodoverloading;

public class Q1_MethodOverloading {

    // Method with one parameter
    void add(int a) {
        System.out.println("One parameter: " + a);
    }

    // Method with two parameters
    void add(int a, int b) {
        System.out.println("Two parameters: " + (a + b));
    }

    public static void main(String[] args) {

        Q1_MethodOverloading obj = new Q1_MethodOverloading();

        // Calling one-parameter method
        obj.add(10);

        // Calling two-parameter method
        obj.add(10, 20);
    }
}