package com.jala.loops;

public class Q8_FindAmstrongNumnerOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int temp=n;
		int sum=0,r;
		while(n!=0) {
			r=n%10;
			sum+=r*r*r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+ " is Amstrong Number");
		}else {
			System.out.println(temp+ " is not Amstrong Number");
	
		}
	}

}
