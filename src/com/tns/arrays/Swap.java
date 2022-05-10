package com.tns.arrays;

public class Swap {

	public static void main(String[] args) {

		int arr[]= {1,2,3,5,6,7,44};
		
		System.out.println("Values before Swapping..");
		for(int i:arr)
		{
			System.out.print(i+",");
		}
		for(int i=0;i<arr.length/2;i++)
		{
			int ss=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=ss;
			
		}
		System.out.println("\nValues After Swappin..");
		for(int i:arr)
		{
			System.out.print(i+",");
		}
		
	}

}
