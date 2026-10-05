package com.jala.loops;

public class Q9_FindPrimeOrNot {

    public static void main(String[] args) {

        int n = 21;

        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
            return;
        }

        int count = 0;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0) {
                count++;
            }
        }

        if (count < 1) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}