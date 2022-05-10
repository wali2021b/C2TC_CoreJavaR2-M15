package com.tns.arrays;

import java.util.Scanner;

public class TowDArr {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int marks[][]=new int[4][5];
		System.out.println("Enter Marks of Each Student");
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter Marks Of  Student "+(i+1));
			for(int j=0;j<5;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enterd Marks are..");
		for(int i=0;i<4;i++)
		{
			System.out.print("\n Marks Of  Student "+ (i+1)+": ");
			for(int j=0;j<5;j++)
			{
				System.out.print(marks[i][j]+"\t");
			}
		}
		
	}

}
