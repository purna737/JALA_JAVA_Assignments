package com.jala.interfaces;

interface ParentInterfaceQ9 {

    void display();
}

interface ChildInterfaceQ9 extends ParentInterfaceQ9 {

    void show();
}

public class Q9_MultipleInterfaces implements ChildInterfaceQ9 {

    @Override
    public void display() {
        System.out.println("Parent interface method");
    }

    @Override
    public void show() {
        System.out.println("Child interface method");
    }

    public static void main(String[] args) {

        Q9_MultipleInterfaces obj =
                new Q9_MultipleInterfaces();

        obj.display();
        obj.show();
    }
}