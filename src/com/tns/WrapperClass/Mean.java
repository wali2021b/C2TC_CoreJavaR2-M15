package com.tns.WrapperClass;

import java.util.Scanner;
import java.util.Arrays;

public class Mean {

	public static void main(String[] args) {

		System.out.println("How many Number's mean do you want to find.. ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		float sum=0.0f;
		float [] arr= new float[n];
		do {
			
			System.out.println("Enter "+(i+1) +" Number");
		     arr[i]=sc.nextFloat();
		     sum+=arr[i];
			
			i++;
			
		}while(i<n);
		
//		System.out.println(arr.toString());
		System.out.println("Sum of the values is :"+sum);
		System.out.println("And Average of the values is "+sum/n);
		
	}

}
