package com.tns.arrays;

import java.util.Scanner;

//Write a program to find out total marks obtained by a student if the
//student gets 3 marks for the correct answer and -1 for the wrong
//answer
public class TotalMarks {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		int a[]=new int[] {1,0,1,1,0,0,1};
	int total=0;
	System.out.println("Your Marks are..");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
//			a[i]=sc.nextInt();
			if(a[i]==1)
				total+=a[i]*3;
			else if(a[i]==0)
			{
				total--;
			}
		}
		System.out.println("\nTotal marks are : "+total);
		sc.close();
		
	}

}
