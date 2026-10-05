package com.jala.constructors;

class Q5_Student {

    Q5_Student() {
        System.out.println("Constructor called");
    }
}

public class Q5_CallConstructorMultipleTimes {

    public static void main(String[] args) {

        // Constructor is called when object is created
        Q5_Student obj = new Q5_Student();

        System.out.println("Same object cannot call constructor again.");

        // Creating another object calls the constructor again
        Q5_Student obj2 = new Q5_Student();
    }
}