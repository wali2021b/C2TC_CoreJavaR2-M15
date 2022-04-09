package com.tns.WrapperClass;

import java.util.Scanner;

//		Write a program in Java to display n terms of natural numbers and their sum.
public class NtermSum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter limit of Natural numbers..");
		int sum=0;
		int num=sc.nextInt();
		int i=1;
		for(i=1;i<=num;i++)
		{
			System.out.print(i+"\t");
			sum+=i;
		}
		System.out.println("\nTotal Digits are "+ (i-1)+" & Sum of the digits is :"+sum);
	}

}
