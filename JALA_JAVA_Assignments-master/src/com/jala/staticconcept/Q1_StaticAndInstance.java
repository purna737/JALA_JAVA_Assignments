package com.jala.staticconcept;

public class Q1_StaticAndInstance {

    // 2 static variables
    static int staticNumber1 = 10;
    static int staticNumber2 = 20;

    // 2 instance variables
    int instanceNumber1 = 30;
    int instanceNumber2 = 40;

    // 2 static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // 2 instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // main method
    public static void main(String[] args) {

        Q1_StaticAndInstance obj = new Q1_StaticAndInstance();

        System.out.println("Static variable 1: " + staticNumber1);
        System.out.println("Static variable 2: " + staticNumber2);

        System.out.println("Instance variable 1: " + obj.instanceNumber1);
        System.out.println("Instance variable 2: " + obj.instanceNumber2);

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}