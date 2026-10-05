package com.jala.otherpackage;

import com.jala.accessmodifiers.Q3_ProtectedParent;

public class Q3_DifferentPackageChild extends Q3_ProtectedParent {

    public static void main(String[] args) {

        Q3_DifferentPackageChild obj =
                new Q3_DifferentPackageChild();

        // Protected members can be accessed
        // in a child class from a different package
        System.out.println("Number: " + obj.number);
        System.out.println("Name: " + obj.name);

        obj.display();
    }
}