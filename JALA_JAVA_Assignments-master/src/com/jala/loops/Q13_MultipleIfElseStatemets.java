package com.jala.loops;

public class Q13_MultipleIfElseStatemets {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int large;
		if(a>b) {
			if(a>c) {
				large=a;
			}
			else {
				large=c;
			}
		}
		else if(b>a){
			if(b>c) {
				large=b;
			}
			else {
				large=c;
			}
		}
		else {
			large=c;
		}
		System.out.println("The larger number is "+large);
	}
}
