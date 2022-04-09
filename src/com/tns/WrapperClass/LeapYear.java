package com.tns.WrapperClass;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Enter a Year ");
		Scanner sc= new Scanner(System.in);
		short year=sc.nextShort();
		if(year%4==0)
		{
			System.out.println(year +" is a leap Year...");
		}
		else
		{
			System.out.println("OOPs! "+year +" is Not aleap Year...");
		}
		
	}

}
