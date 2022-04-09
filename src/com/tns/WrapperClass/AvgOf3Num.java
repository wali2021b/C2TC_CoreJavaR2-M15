package com.tns.WrapperClass;

import java.util.Scanner;

public class AvgOf3Num {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number:");
		int a=sc.nextInt();
		
		System.out.println("Enter second Number:");
		int b=sc.nextInt();
		System.out.println("Enter Third Number:");
		int c=sc.nextInt();
		int sum= a+b+c;
		System.out.println("The sum of the enterd value is : \t "+sum + "\tand Mean is:\t"+sum/3.0);
	}

}
