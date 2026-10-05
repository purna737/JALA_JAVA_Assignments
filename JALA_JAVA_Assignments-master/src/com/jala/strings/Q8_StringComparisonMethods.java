package com.jala.strings;

public class Q8_StringComparisonMethods {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        // equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: "
                + str1.equalsIgnoreCase(str2));

        // startsWith()
        System.out.println("startsWith: "
                + str1.startsWith("Ja"));

        // endsWith()
        System.out.println("endsWith: "
                + str1.endsWith("va"));

        // compareTo()
        System.out.println("compareTo: "
                + str1.compareTo(str3));
    }
}