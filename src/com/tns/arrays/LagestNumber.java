package com.tns.arrays;
//Write a Java code to ﬁnd the largest number in an array.
public class LagestNumber {
	 int largest(int[] array)
	{
		 int largest=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(largest<array[i])
				largest=array[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		LagestNumber lg=new LagestNumber();
		int arr[]= {1,2,3,4,6,4,8,9,1221,200,11,3333};
		
		System.out.println("Largest Value of the array is: "+lg.largest(arr));

	}

}
