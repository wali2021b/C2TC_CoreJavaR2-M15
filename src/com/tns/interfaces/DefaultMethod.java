package com.tns.interfaces;

import java.util.Scanner;

interface Sayable{
default void say(){
System.out.println("Hello, this is default method");
}
 static void sayMore(String msg) {
	System.out.println("Default method's Messag is "+msg);
}
}

public class DefaultMethod implements Sayable {
	public void sayMore(String s)
	{
		System.out.println("Your Message is : "+s);
	}

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		DefaultMethod dm=new DefaultMethod();
		dm.say();
		dm.sayMore("Let's check the functionality..");
		dm.sayMore("Hello");
		System.out.println("Enter a message : ");
		dm.sayMore(sc.nextLine());
		Sayable.sayMore("waliullah");
		
	}

}
