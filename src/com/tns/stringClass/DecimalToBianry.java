package com.tns.stringClass;

public class DecimalToBianry {
	static int bin(int a)
	{
		int n=0;
		if(a==0 || a==1)
		return 1;
		else {
			n=a%2;
			a/=2;
		}
		n=bin(a-1);
		return n;
		
	}

	public static void main(String[] args) {
System.out.println("Binary of 14 is "+bin(14));
	}

}
