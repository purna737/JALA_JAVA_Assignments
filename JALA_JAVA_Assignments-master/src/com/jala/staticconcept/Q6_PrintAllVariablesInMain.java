package com.jala.staticconcept;

public class Q6_PrintAllVariablesInMain {

    // Static variables
    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    // Instance variables
    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    public static void main(String[] args) {

        // Access static variables directly
        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);

        // Create object to access instance variables
        Q6_PrintAllVariablesInMain obj =
                new Q6_PrintAllVariablesInMain();

        System.out.println("Instance variable 1: " + obj.instanceNumber1);
        System.out.println("Instance variable 2: " + obj.instanceNumber2);
    }
}