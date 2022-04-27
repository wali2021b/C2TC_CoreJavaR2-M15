package com.tns.stringClass;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any url of the website..");
		String str=sc.next();
		
		if(str.contains(".com"))
			System.out.println("Commercial Website..");
		else if(str.contains(".org"))
			System.out.println("Organisational Websits.");
		else if(str.contains(".in"))
			System.out.println("Indian Websites..");
		else
			System.out.println("Sorry! It's Not known to me...");
			

	}

}
