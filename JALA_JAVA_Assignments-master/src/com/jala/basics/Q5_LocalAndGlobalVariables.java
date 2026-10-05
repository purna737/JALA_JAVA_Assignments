package com.jala.basics;

public class Q5_LocalAndGlobalVariables {

	int num=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		Q5_LocalAndGlobalVariables obj=new Q5_LocalAndGlobalVariables();
		System.out.println("Local variable: "+num);
		System.out.println("Instance variable: "+obj.num);

	}

}
