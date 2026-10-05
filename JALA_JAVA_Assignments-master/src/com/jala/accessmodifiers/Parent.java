package com.jala.accessmodifiers;

class Parent {

    private int number = 100;
    private String name = "Purna";

    private void display() {
        System.out.println("Private method called");
    }

    public static void main(String[] args) {

        Parent obj = new Parent();

        // Accessing private fields inside the same class
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        // Calling private method inside the same class
        obj.display();

        // Creating child class object
        Child child = new Child();
        child.testPrivateAccess();
    }
}

class Child extends Parent {

    void testPrivateAccess() {

        System.out.println("Trying to access private members from Child class:");

        // Private fields cannot be accessed in child class
        // System.out.println(number);  // Compilation Error
        // System.out.println(name);    // Compilation Error

        // Private method cannot be accessed in child class
        // display();                   // Compilation Error

        System.out.println("Private fields and methods are NOT directly accessible.");
    }
}