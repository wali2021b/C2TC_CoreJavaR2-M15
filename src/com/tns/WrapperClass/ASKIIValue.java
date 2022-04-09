package com.tns.WrapperClass;

import java.util.Scanner;

public class ASKIIValue {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		int cc=ch;
		System.out.println(ch);
		System.out.printf("ASCII Value of %c  is: %d ",ch,cc);
		
	}

}
