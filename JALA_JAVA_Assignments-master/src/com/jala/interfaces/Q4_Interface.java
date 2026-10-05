package com.jala.interfaces;

interface Printable {

    void print();
}

public class Q4_Interface implements Printable {

    @Override
    public void print() {
        System.out.println("Printing using interface method");
    }

    public static void main(String[] args) {

        Q4_Interface obj = new Q4_Interface();

        obj.print();
    }
}