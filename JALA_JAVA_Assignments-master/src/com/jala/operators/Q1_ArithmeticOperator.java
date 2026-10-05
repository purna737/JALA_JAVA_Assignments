package com.jala.operators;

public class Q1_ArithmeticOperator{

	void add(int a, int b) {
		System.out.println("Addition :"+(a+b));
	}
	void subtract(int a, int b) {
		System.out.println("Subtration :"+(a-b));
	}
	void div(int a, int b) {
		System.out.println("Division :"+(a/b));
	}
	void multiplication(int a, int b) {
		System.out.println("Multiplication :"+(a*b));
	}
	public static void main(String[] args) {
		
		Q1_ArithmeticOperator obj=new Q1_ArithmeticOperator();
		obj.add(10, 20);
		obj.subtract(30, 20);
		obj.div(40, 5);
		obj.multiplication(10, 10);
		
	}

}
