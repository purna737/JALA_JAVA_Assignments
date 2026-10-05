package com.jala.strings;

public class Q6_Matches {

    public static void main(String[] args) {

        String text = "Purna123";

        boolean result = text.matches("[A-Za-z]+[0-9]+");

        System.out.println("Matches pattern: " + result);
    }
}