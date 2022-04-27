package com.tns.stringClass;

import java.util.Scanner;

public class EquaIgnores {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an string..");
		String str=sc.next();
		String str1=str.toUpperCase();
		if(str1.equalsIgnoreCase(str))
			System.out.println("Both the strings :" +str1+" and "+ str+ "  are same");
		else
		{
			System.out.println("are Not same..");
		}
		
		sc.close();
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",5));                            //it will start searching from index 5  if string contains less then 5 to -1;
		
	}

}
