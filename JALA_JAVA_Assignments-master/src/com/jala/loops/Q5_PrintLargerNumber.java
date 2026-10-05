package com.jala.loops;

public class Q5_PrintLargerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int a = 10;
        int b = 20;
        int c = 30;

        int larger;

        if (a > b && a > c) {
            larger = a;
        } else if (b > c) {
            larger = b;
        } else {
            larger = c;
        }

        System.out.println("Larger number is: " + larger);

		

	}

}
