package com.jala.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1_ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add 10 elements
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("HTML");
        list.add("CSS");
        list.add("JavaScript");
        list.add("SQL");
        list.add("Spring");
        list.add("Hibernate");

        System.out.println("Original List: " + list);

        // Iterate using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add element at specific index
        list.add(2, "React");
        System.out.println("After adding at index 2: " + list);

        // Remove element
        list.remove("C++");
        System.out.println("After removing C++: " + list);

        // Remove element at specific index
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // Update element
        list.set(0, "Core Java");
        System.out.println("After updating index 0: " + list);

        // Check element at index
        System.out.println("Element at index 2: " + list.get(2));

        // Get element at index
        System.out.println("Element at index 4: " + list.get(4));

        // Size
        System.out.println("Size: " + list.size());

        // Check whether element exists
        System.out.println("Contains Java: " + list.contains("Java"));
        System.out.println("Contains Spring: " + list.contains("Spring"));

        // Remove all elements
        list.clear();
        System.out.println("After removing all elements: " + list);
    }
}