package com.tns.stringClass;

import java.util.Scanner;

public class ComparingStr {

	public static void main(String[] args) {

	String s1,s2;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two Strings..");
		s1=sc.next();
		s2=sc.next();
		if(s1.equals(s2))
		{
			System.out.println("Bothe The Strings are Same.. ");
		}
		else
		{
			System.out.println("You Entered Two different Strings..");
		}
		
		sc.close();
		
	}

}
