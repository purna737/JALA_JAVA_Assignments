package com.jala.constructors;

class ConstructorExample {

    // Private constructor
    private ConstructorExample() {
        System.out.println("Private constructor called");
    }

    // Public constructor
    public ConstructorExample(int number) {
        System.out.println("Public constructor called");
        System.out.println("Number: " + number);
    }

    // Protected constructor
    protected ConstructorExample(String name) {
        System.out.println("Protected constructor called");
        System.out.println("Name: " + name);
    }

    // Default constructor
    ConstructorExample(double marks) {
        System.out.println("Default constructor called");
        System.out.println("Marks: " + marks);
    }

    // Method inside the same class can call private constructor
    static void callPrivateConstructor() {
        ConstructorExample obj = new ConstructorExample();
    }
}

public class Q3_ConstructorAccessModifiers {

    public static void main(String[] args) {

        // Calling private constructor through a method
        ConstructorExample.callPrivateConstructor();

        // Calling public constructor
        ConstructorExample obj1 =
                new ConstructorExample(100);

        // Calling protected constructor
        ConstructorExample obj2 =
                new ConstructorExample("Purna");

        // Calling default constructor
        ConstructorExample obj3 =
                new ConstructorExample(85.5);
    }
}