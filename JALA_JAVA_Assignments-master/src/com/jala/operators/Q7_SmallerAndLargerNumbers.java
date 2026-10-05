package com.jala.operators;

public class Q7_SmallerAndLargerNumbers {

	public static void main(String[] args) {

		        int a = 10;
		        int b = 20;
		        int c = 30;

		        int smaller;
		        int larger;

		        if (a < b && a < c) {
		            smaller = a;
		        } else if (b < c) {
		            smaller = b;
		        } else {
		            smaller = c;
		        }

		        if (a > b && a > c) {
		            larger = a;
		        } else if (b > c) {
		            larger = b;
		        } else {
		            larger = c;
		        }

		        System.out.println("Smaller number is: " + smaller);
		        System.out.println("Larger number is: " + larger);
		    }

}
