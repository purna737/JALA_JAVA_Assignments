package com.jala.loops;

public class Q10_ANumberIsPalindromOrNot {
	public static void main(String[] args){
		int n=131;
		int temp=n;
		int sum=0,rev;
		while(temp!=0) {
			rev=temp%10;
			sum=sum*10+rev;
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println("The given number is a palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}
	}
}
