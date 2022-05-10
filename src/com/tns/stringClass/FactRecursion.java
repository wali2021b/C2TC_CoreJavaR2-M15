package com.tns.stringClass;

public class FactRecursion {
	public static int fact(int a)
	{
		if(a==0 || a==1)
			return 1;
		return a*fact(a-1);
	}

	public static void main(String[] args) {

		int n=5;
		System.out.println("factorial of "+n+" is = "+fact(n));
	}

}
