package com.tns.stringClass;

import java.util.Scanner;

public class StringInfo {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string.");
String str=sc.nextLine();
System.out.println("length of the string is .." +str.length());

System.out.println("First Index of your String is. : "+str.charAt(0));
System.out.println("And Last Index of the String is : "+str.charAt(str.length()-1));
boolean space=str.contains(" ");
if(space)
{
	System.out.println("This string Contains Space too..");
}
else
{
	System.out.println("This string doesn't Contain any Space..");
}



	}

}
