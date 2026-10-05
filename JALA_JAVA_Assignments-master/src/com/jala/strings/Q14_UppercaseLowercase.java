package com.jala.strings;

public class Q14_UppercaseLowercase {

    public static void main(String[] args) {

        String text = "Java Full Stack";

        String upper = text.toUpperCase();
        String lower = text.toLowerCase();

        System.out.println("Original String: " + text);
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}