package com.jala.interfaces;

interface FirstInterfaceQ10 {

    void display();
}

interface SecondInterfaceQ10 {

    void show();
}

public class Q10_MultipleInterfaces
        implements FirstInterfaceQ10, SecondInterfaceQ10 {

    @Override
    public void display() {
        System.out.println("First interface method");
    }

    @Override
    public void show() {
        System.out.println("Second interface method");
    }

    public static void main(String[] args) {

        Q10_MultipleInterfaces obj =
                new Q10_MultipleInterfaces();

        obj.display();
        obj.show();
    }
}
