package com.jala.constructors;

class Student {

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // One-argument constructor
    Student(int id) {
        System.out.println("One-argument constructor called");
        System.out.println("ID: " + id);
    }

    // Two-argument constructor
    Student(int id, String name) {
        System.out.println("Two-argument constructor called");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Another two-argument constructor
    Student(String name, double marks) {
        System.out.println("Another two-argument constructor called");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Q1_Constructors {

    public static void main(String[] args) {

        // Calling default constructor
        Student obj1 = new Student();

        // Calling one-argument constructor
        Student obj2 = new Student(101);

        // Calling two-argument constructor
        Student obj3 = new Student(102, "Purna");

        // Calling another two-argument constructor
        Student obj4 = new Student("Purna", 85.5);
    }
}