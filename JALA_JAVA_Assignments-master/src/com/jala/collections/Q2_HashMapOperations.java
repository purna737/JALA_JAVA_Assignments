package com.jala.collections;

import java.util.HashMap;
import java.util.Map;

public class Q2_HashMapOperations {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(101, "Purna");
        students.put(102, "Rahul");
        students.put(103, "Suresh");
        students.put(104, "Anil");
        students.put(105, "Kiran");
        students.put(106, "Ravi");
        students.put(107, "Arjun");
        students.put(108, "Vijay");
        students.put(109, "Sai");
        students.put(110, "Prakash");

        System.out.println("HashMap: " + students);

        // Fetch value by key
        System.out.println("Student with ID 101: " + students.get(101));

        // Clone / copy HashMap
        HashMap<Integer, String> clonedMap =
                (HashMap<Integer, String>) students.clone();

        System.out.println("Cloned Map: " + clonedMap);

        // Check key
        System.out.println("Contains key 105: "
                + students.containsKey(105));

        // Check value
        System.out.println("Contains value Purna: "
                + students.containsValue("Purna"));

        // Check whether map is empty
        System.out.println("Is Empty: " + students.isEmpty());

        // Size
        System.out.println("Size: " + students.size());

        // Print all keys
        System.out.println("All Keys:");
        for (Integer key : students.keySet()) {
            System.out.println(key);
        }

        // Print all values
        System.out.println("All Values:");
        for (String value : students.values()) {
            System.out.println(value);
        }

        // Remove specific key-value pair
        students.remove(110);
        System.out.println("After removing ID 110: " + students);

        // Copy all elements to another HashMap
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(students);

        System.out.println("Another Map: " + anotherMap);
    }
}