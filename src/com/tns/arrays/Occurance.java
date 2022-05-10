package com.tns.arrays;
//Write a Java code to ﬁnd the number of occurrences of a given number in an
//array.
public class Occurance {

	public static void main(String[] args) {

		int	arr[] = {23, 82,23, 57, 45, 23,38,38};
		int key = 38;
		byte times=0;
		for(int i : arr)
		{
			if(i==key)
			{
				times++;
			}
		}
		
		System.out.println(key+" : is present in the arry only :"+times+" times");
		
	}

}
