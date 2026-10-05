package com.jala.constructors;

class Parent {

    // Default constructor
    Parent() {
        System.out.println("Parent default constructor called");
    }

    // Argument constructor
    Parent(int number) {
        System.out.println("Parent argument constructor called");
        System.out.println("Number: " + number);
    }
}

class Child extends Parent {

    // Calling parent default constructor
    Child() {
        super();
        System.out.println("Child default constructor called");
    }

    // Calling parent argument constructor
    Child(int number) {
        super(number);
        System.out.println("Child argument constructor called");
    }
}

public class Q2_SuperConstructors {

    public static void main(String[] args) {

        // Calls parent default constructor
        Child obj1 = new Child();

        System.out.println();

        // Calls parent argument constructor
        Child obj2 = new Child(100);
    }
}