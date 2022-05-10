package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainsMethod {

	public static void main(String[] args) {

		List<String> var = new ArrayList<String>();
		var.add("pen");
		var.add("pencil");
		var.add("eraser");
//		System.out.println("List " +var);
//		boolean res= var.contains("pencil");
//		System.out.println("Is pencil present in the list: " + res);
		
		System.out.println("Inserted Items are: "+var);
		System.out.println("What do You Want to find in the list?");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean r;
		r=3>1;
		System.out.println("result is:"+r);
//		int c=2;
//		do {
//			if(!(s=="2"))
//			{
//				
//			if(var.contains(s))
//			{
//				System.out.println("Yes "+ s+" is present");
//				
//			}
//			else
//				System.out.println("Sorry Not Found..");
//			
//			System.out.println("\nenter something else you Want to find..\n else press 2 to quit..");
//			s=sc.next();
//			}
//				
//		}while(s=="2");
	}

}
