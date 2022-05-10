package com.tns.arrays;
//Write a Java code to search a given number in an array. If the element is found then print
//Found, else print Not Found
public class Search {

	public static void main(String[] args) {
	int	arr[] = {23, 82, 57, 45, 38};
		int skey = 453;
		boolean f=false;
		for(int i : arr)
		{
			if(i==skey)
			{
				System.out.println("Found");
				f=true;
				break;
			}
		}
		if(!f)
		{
			System.out.println("Sorry not found");
			
		}
		
	}

}
