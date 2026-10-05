package com.jala.thisandsuper;

public class Q3_ThisConstructor {

    Q3_ThisConstructor() {
        this(100);
        System.out.println("Default constructor called");
    }

    Q3_ThisConstructor(int number) {
        System.out.println("Argument constructor called");
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        Q3_ThisConstructor obj = new Q3_ThisConstructor();
    }
}
