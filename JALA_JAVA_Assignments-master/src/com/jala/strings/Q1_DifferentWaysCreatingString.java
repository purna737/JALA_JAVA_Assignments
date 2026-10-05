package com.jala.strings;

public class Q1_DifferentWaysCreatingString {

    public static void main(String[] args) {

        // 1. Using String literal
        String s1 = "Hello";

        // 2. Using new keyword
        String s2 = new String("Hello");

        System.out.println("String using literal: " + s1);
        System.out.println("String using new keyword: " + s2);
    }
}