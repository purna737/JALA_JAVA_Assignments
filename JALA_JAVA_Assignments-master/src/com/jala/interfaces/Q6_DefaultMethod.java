package com.jala.interfaces;

interface Q6_MyInterface {

    default void display() {
        System.out.println("Default method of interface");
    }
}

public class Q6_DefaultMethod implements Q6_MyInterface {

    public static void main(String[] args) {

        Q6_DefaultMethod obj = new Q6_DefaultMethod();

        // Calling default method without overriding it
        obj.display();
    }
}