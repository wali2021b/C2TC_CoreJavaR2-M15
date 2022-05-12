package com.tns.arrays;

public class SecondMax {

	public static void main(String[] args) {

		System.out.println("Implement an array program to find second Max in the array..");
		int a[]=new int[] {1,33,453,9,89,76};
		int max=a[0];
		int smax=a[0];
		System.out.print("\nArray Elements are[ ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
			if(a[i]>max)
			{
			
				smax=max;
				max=a[i];
			}
			if(smax<a[i] && max>a[i])
			{
				smax=a[i];
			}
		}
		System.out.println("]");
		System.out.println("Max Is :"+max);
		System.out.println("Second Max Is :"+smax);
	}

}
