package com.jala.methodoverloading;

public class Q2_MethodOverloading {

    // Method with one int parameter
    void display(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method with two String parameters
    void display(String firstName, String lastName) {
        System.out.println("Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {

        Q2_MethodOverloading obj = new Q2_MethodOverloading();

        // Calling first method
        obj.display(100);

        // Calling second method
        obj.display("Chikkala", "Purna");
    }
}