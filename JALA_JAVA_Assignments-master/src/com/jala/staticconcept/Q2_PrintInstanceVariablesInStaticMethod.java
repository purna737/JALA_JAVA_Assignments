package com.jala.staticconcept;

public class Q2_PrintInstanceVariablesInStaticMethod {

    int number1 = 10;
    int number2 = 20;

    static void printInstanceVariables() {

        Q2_PrintInstanceVariablesInStaticMethod obj =
                new Q2_PrintInstanceVariablesInStaticMethod();

        System.out.println("Instance variable 1: " + obj.number1);
        System.out.println("Instance variable 2: " + obj.number2);
    }

    public static void main(String[] args) {

        printInstanceVariables();
    }
}