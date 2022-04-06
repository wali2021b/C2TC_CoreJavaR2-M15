package com.tns.M15;

public class Justify {
static {
	System.out.println("Static Block creates befor Main Method,");
}
Justify()
{
	System.out.println("Constructors only invoke when variable is instantiated.. means new keyword is used...");
	System.out.println("for each new object only once here...");
}
	public static void main(String[] args) {

		System.out.println("Hello inside main..");
		Justify j=new Justify();
		
	}

}
