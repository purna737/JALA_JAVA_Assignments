package com.jala.constructors;

public class Q4_ConstructorReturnType {

    // These are methods, NOT constructors
    int Student() {
        System.out.println("This is an int return type method");
        return 100;
    }

    String StudentName() {
        System.out.println("This is a String return type method");
        return "Purna";
    }

    // Actual constructor
    Q4_ConstructorReturnType() {
        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {

        Q4_ConstructorReturnType obj =
                new Q4_ConstructorReturnType();

        int number = obj.Student();
        String name = obj.StudentName();

        System.out.println("Returned integer: " + number);
        System.out.println("Returned String: " + name);
    }
}