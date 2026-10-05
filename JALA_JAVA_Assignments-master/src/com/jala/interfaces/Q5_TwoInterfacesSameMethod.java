package com.jala.interfaces;

interface FirstInterface {

    void display();
}

interface SecondInterface {

    void display();
}

public class Q5_TwoInterfacesSameMethod
        implements FirstInterface, SecondInterface {

    @Override
    public void display() {
        System.out.println("Same method implemented for both interfaces");
    }

    public static void main(String[] args) {

        Q5_TwoInterfacesSameMethod obj =
                new Q5_TwoInterfacesSameMethod();

        obj.display();
    }
}