package com.jala.methodoverloading;

public class Q5_MethodOverloading {

    // Method 1
    int display(int number) {
        return number;
    }

    /*
     * This is NOT allowed in Java.
     * Same method name + same parameter type,
     * only return type is different.
     *
     * String display(int number) {
     *     return "Purna";
     * }
     */

    public static void main(String[] args) {

        Q5_MethodOverloading obj = new Q5_MethodOverloading();

        int result = obj.display(100);

        System.out.println("Returned value: " + result);
        System.out.println(
            "Methods cannot be overloaded only by changing return type."
        );
    }
}