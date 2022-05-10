package com.tns.stringClass;

public class DecimalToBianry {
	static void bin(int a)
	{
		
		if(a==1)
		{
			System.out.print(1);
		}
		else {
			bin(a/2);                           // 7, 3, 1
			                                    // 1 1 10
			
			System.out.print(a%2); 
			
		}
		
		
	}

	public static void main(String[] args) {
System.out.println("Binary of 14 is ");
bin(14);
	}

}
