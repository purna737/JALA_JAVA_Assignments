package com.jala.thisandsuper;

public class Q4_ThisArgumentConstructor {

    int number;
    String name;

    Q4_ThisArgumentConstructor() {
        this(100, "Purna");
        System.out.println("Default constructor called");
    }

    Q4_ThisArgumentConstructor(int number, String name) {
        this.number = number;
        this.name = name;

        System.out.println("Argument constructor called");
        System.out.println("Number: " + this.number);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {

        Q4_ThisArgumentConstructor obj =
                new Q4_ThisArgumentConstructor();
    }
}
