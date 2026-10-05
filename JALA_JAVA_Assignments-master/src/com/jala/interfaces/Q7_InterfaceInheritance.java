package com.jala.interfaces;

interface ParentInterface {

    void parentMethod();
}

interface ChildInterface extends ParentInterface {

    void childMethod();
}

public class Q7_InterfaceInheritance implements ChildInterface {

    @Override
    public void parentMethod() {
        System.out.println("Parent interface method");
    }

    @Override
    public void childMethod() {
        System.out.println("Child interface method");
    }

    public static void main(String[] args) {

        Q7_InterfaceInheritance obj =
                new Q7_InterfaceInheritance();

        obj.parentMethod();
        obj.childMethod();
    }
}