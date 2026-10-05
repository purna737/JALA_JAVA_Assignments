package com.jala.abstractclass;

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Q1_AbstractClass {

    public static void main(String[] args) {

        System.out.println("Abstract class created successfully.");
        System.out.println("It contains abstract and non-abstract methods.");
    }
}