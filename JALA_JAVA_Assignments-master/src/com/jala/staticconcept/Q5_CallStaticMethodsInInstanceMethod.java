package com.jala.staticconcept;

public class Q5_CallStaticMethodsInInstanceMethod {

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod() {

        staticMethod1();
        staticMethod2();
    }

    public static void main(String[] args) {

        Q5_CallStaticMethodsInInstanceMethod obj =
                new Q5_CallStaticMethodsInInstanceMethod();

        obj.instanceMethod();
    }
}