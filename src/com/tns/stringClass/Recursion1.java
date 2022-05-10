package com.tns.stringClass;

public class Recursion1 {
	public static int rr(int n)
	{
		int s=0;
		
		if(n==1)
			return 1;
		else
			return n+rr(n-1);
	}

	public static void main(String[] args) {
	
		System.out.println(rr(10));

		
	}

}
