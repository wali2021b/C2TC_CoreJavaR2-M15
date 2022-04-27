package com.tns.stringClass;

public class IsEmpty {

	public static void main(String[] args) {

		String name="";
		String name1="abc";
		if(name.isEmpty())
		{
			System.out.println("Empty String..");
		}
		else
		{
			System.out.println("Name Is: "+ name);
		}
		
		if(!(name.isEmpty()))
		{
			System.out.println("Not Empty String..");
		}
		else
		{
			System.out.println("None empty is applied");
		}
		
			System.out.println(String.join(""," Sayyed "," is My First name"," And Waliullah is my actual Name.."));
			
			System.out.println(name.valueOf(100)+11);
	}			

}
