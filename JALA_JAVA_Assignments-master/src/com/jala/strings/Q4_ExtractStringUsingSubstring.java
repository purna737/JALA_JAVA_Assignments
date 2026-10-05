package com.jala.strings;

public class Q4_ExtractStringUsingSubstring {

    public static void main(String[] args) {

        String name = "Chikkala Purna";

        String part = name.substring(9);

        System.out.println("Original String: " + name);
        System.out.println("Extracted String: " + part);
    }
}