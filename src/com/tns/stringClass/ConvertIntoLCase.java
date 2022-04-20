package com.tns.stringClass;

import java.util.Scanner;

public class ConvertIntoLCase {
	public static void main(String[] args) {

		String s1,L,Up;
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a String.");
			s1=sc.nextLine();
			L=s1.toLowerCase();
			Up=s1.toUpperCase();
			
			System.out.println("You Entered : "+s1+"\nLower case of the string is: "+L+" \nUpper Case is:"+Up);
	}
	

}
