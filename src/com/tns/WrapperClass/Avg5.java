package com.tns.WrapperClass;

import java.util.Scanner;

public class Avg5 {

	public static void main(String[] args) {
//		Write a program in Java to input 5 numbers from keyboard and find their sum and average.

		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter 5 numbers..");
		int [] avg=new int[5];
	
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+(i+1) +" value");
			
			avg[i]=sc.nextInt();
			sum+=avg[i];
		}
		System.out.println("sum of the given numbers is :"+sum+" & average is : "+sum/3.0f);
	}

}
