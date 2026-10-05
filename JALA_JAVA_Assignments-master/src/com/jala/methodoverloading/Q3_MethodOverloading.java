package com.jala.methodoverloading;

public class Q3_MethodOverloading {

    // First method
    void display(int number) {
        System.out.println("First method: " + number);
    }

    /*
     * This is NOT allowed because it has
     * the same method name and same parameter type.
     *
     * void display(int number) {
     *     System.out.println("Second method: " + number);
     * }
     */

    public static void main(String[] args) {

        Q3_MethodOverloading obj = new Q3_MethodOverloading();

        obj.display(100);

        System.out.println(
            "Two methods with exactly the same signature cannot be overloaded."
        );
    }
}