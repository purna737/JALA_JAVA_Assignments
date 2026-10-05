package com.jala.inheritance;

class A {

    int value = 10;

    void methodA1() {
        System.out.println("A - Method 1");
    }

    void methodA2() {
        System.out.println("A - Method 2");
    }

    void display() {
        System.out.println("A - Display method");
    }
}

class B extends A {

    int value = 20;

    void methodB1() {
        System.out.println("B - Method 1");
    }

    void methodB2() {
        System.out.println("B - Method 2");
    }

    @Override
    void display() {
        System.out.println("B - Display method");
    }
}

class C extends B {

    int value = 30;

    void methodC1() {
        System.out.println("C - Method 1");
    }

    void methodC2() {
        System.out.println("C - Method 2");
    }

    @Override
    void display() {
        System.out.println("C - Display method");
    }
}

public class Q2_Inheritance {

    public static void main(String[] args) {

        // Create objects for A, B and C
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods using their own objects
        objA.methodA1();
        objA.methodA2();
        objA.display();

        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();

        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();

        // Runtime polymorphism using superclass reference
        A ref;

        ref = objB;
        ref.display();

        ref = objC;
        ref.display();

        // Runtime polymorphism with data members
        ref = objB;
        System.out.println("Value using A reference for B object: " + ref.value);

        ref = objC;
        System.out.println("Value using A reference for C object: " + ref.value);
    }
}
