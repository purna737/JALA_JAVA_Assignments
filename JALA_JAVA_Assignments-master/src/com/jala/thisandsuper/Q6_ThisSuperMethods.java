package com.jala.thisandsuper;

class ParentQ6 {

    void parentMethod() {
        System.out.println("Parent method called");
    }
}

public class Q6_ThisSuperMethods extends ParentQ6 {

    void currentMethod() {
        System.out.println("Current class method called");
    }

    void display() {

        // Calling current class method using this
        this.currentMethod();

        // Calling parent class method using super
        super.parentMethod();
    }

    public static void main(String[] args) {

        Q6_ThisSuperMethods obj = new Q6_ThisSuperMethods();

        obj.display();
    }
}