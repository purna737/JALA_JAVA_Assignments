package com.jala.accessmodifiers;

public class Q3_SamePackage {

    public static void main(String[] args) {

        Q3_ProtectedParent obj = new Q3_ProtectedParent();

        // Protected members can be accessed
        // from another class in the same package
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();
    }
}