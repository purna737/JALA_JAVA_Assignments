package com.jala.operators;

public class Q2_IncrementAndDecrement {

	void incrementDecrement() {
        int a = 10;

        int b = ++a;   // pre-increment
        int c = a--;   // post-decrement

        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("Value of a: " + a);

        a++;
        --a;

        System.out.println("After increment and decrement: " + a);
    }

    public static void main(String[] args) {

        Q2_IncrementAndDecrement obj =
                new Q2_IncrementAndDecrement();

        obj.incrementDecrement();
    }

}
