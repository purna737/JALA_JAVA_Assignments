package com.jala.staticconcept;

public class Q7_CallStaticAndInstanceMethods {

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        // Calling static methods directly
        staticMethod1();
        staticMethod2();

        // Creating object for instance methods
        Q7_CallStaticAndInstanceMethods obj =
                new Q7_CallStaticAndInstanceMethods();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}