package com.jala.methodoverloading;

public class Q4_MethodOverloading {

    // One parameter of int type
    void display(int number) {
        System.out.println("Integer: " + number);
    }

    // Two parameters of different data types
    void display(int number, String name) {
        System.out.println("Integer: " + number);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Q4_MethodOverloading obj = new Q4_MethodOverloading();

        obj.display(100);

        obj.display(200, "Purna");
    }
}