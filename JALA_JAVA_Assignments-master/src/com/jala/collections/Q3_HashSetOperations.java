package com.jala.collections;

import java.util.HashSet;

public class Q3_HashSetOperations {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // Add 10 elements
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        set.add("HTML");
        set.add("CSS");
        set.add("JavaScript");
        set.add("SQL");
        set.add("Spring");
        set.add("Hibernate");

        System.out.println("HashSet: " + set);

        // Add duplicate element
        set.add("Java");
        System.out.println("After adding duplicate Java: " + set);

        // Check element
        System.out.println("Contains Java: " + set.contains("Java"));

        // Remove element
        set.remove("C");
        System.out.println("After removing C: " + set);

        // Size
        System.out.println("Size: " + set.size());

        // Check whether HashSet is empty
        System.out.println("Is Empty: " + set.isEmpty());

        // Iterate HashSet
        System.out.println("Elements:");
        for (String value : set) {
            System.out.println(value);
        }

        // Create another HashSet
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Spring");
        anotherSet.add("Hibernate");

        // Add all elements
        set.addAll(anotherSet);
        System.out.println("After addAll: " + set);

        // Check common elements
        System.out.println("Contains all elements: "
                + set.containsAll(anotherSet));

        // Remove all elements from anotherSet
        set.removeAll(anotherSet);
        System.out.println("After removeAll: " + set);

        // Clear HashSet
        set.clear();
        System.out.println("After clear: " + set);
    }
}