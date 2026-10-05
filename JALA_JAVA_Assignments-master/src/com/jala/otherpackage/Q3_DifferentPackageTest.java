package com.jala.otherpackage;

import com.jala.accessmodifiers.Q3_ProtectedParent;

public class Q3_DifferentPackageTest {

    public static void main(String[] args) {

        Q3_ProtectedParent obj = new Q3_ProtectedParent();

        // Protected members cannot be accessed directly
        // from a non-child class in a different package.

        // System.out.println(obj.number); // Compilation Error
        // System.out.println(obj.name);   // Compilation Error
        // obj.display();                  // Compilation Error

        System.out.println(
            "Protected members are not directly accessible "
            + "from a non-child class in a different package."
        );
    }
}