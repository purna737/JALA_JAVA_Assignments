package com.jala.staticconcept;

public class Q4_CallInstanceMethodInStaticMethod {

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    static void staticMethod() {

        Q4_CallInstanceMethodInStaticMethod obj =
                new Q4_CallInstanceMethodInStaticMethod();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }

    public static void main(String[] args) {

        staticMethod();
    }
}