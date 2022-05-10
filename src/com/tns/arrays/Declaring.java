package com.tns.arrays;

import java.util.Scanner;

public class Declaring {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,};
		int arr1[];
		arr1=new int[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nEnter 3 Values..for array");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
	
		int permission;
		do {
			System.out.print("\nDo You want to get the Entered Values.\n Press 1 for yes and o for No");
			 permission=sc.nextInt();
			if(permission==1)
			{
				for(int i=0;i<arr1.length;i++)
				{
					System.out.print(arr1[i]+"\t");
				}
				
			}
			else if(permission==0)
			{
			System.out.println("Okk Not printing the values..");
				
			}
		}while(permission>0);
		
		sc.close();
		
	}

}
