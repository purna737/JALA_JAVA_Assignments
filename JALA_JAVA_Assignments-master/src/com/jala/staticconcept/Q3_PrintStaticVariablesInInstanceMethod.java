package com.jala.staticconcept;

public class Q3_PrintStaticVariablesInInstanceMethod {

    static int number1 = 10;
    static int number2 = 20;

    void printStaticVariables() {

        System.out.println("Static variable 1: " + number1);
        System.out.println("Static variable 2: " + number2);
    }

    public static void main(String[] args) {

        Q3_PrintStaticVariablesInInstanceMethod obj =
                new Q3_PrintStaticVariablesInInstanceMethod();

        obj.printStaticVariables();
    }
}