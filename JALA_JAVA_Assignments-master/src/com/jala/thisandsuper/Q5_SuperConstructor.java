package com.jala.thisandsuper;

class ParentQ5 {

    ParentQ5() {
        System.out.println("Parent constructor called");
    }
}

public class Q5_SuperConstructor extends ParentQ5 {

    Q5_SuperConstructor() {
        super();
        System.out.println("Child constructor called");
    }

    public static void main(String[] args) {

        Q5_SuperConstructor obj = new Q5_SuperConstructor();
    }
}
