package com.tns.interfaces;

abstract class C{
	public void display()
	{
		System.out.println("this is display method in abstract class C..");
	}
}

public class SuperKeyword extends C{
public void display()
{
	super.display();
	
	System.out.println("Same Display Methods is OverRiden...");
}
	
	public static void main(String[] args) {

		SuperKeyword sk=new SuperKeyword();
		sk.display();
		
	}

}
