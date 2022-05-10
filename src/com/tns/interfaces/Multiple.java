package com.tns.interfaces;

interface Interface1
{
public void myMethod();
}
interface Interface2
{
public void myMethod();
}

public class Multiple implements Interface2, Interface1
{
public void myMethod()
{
System.out.println("Implementing more than one interfaces");
}

	public static void main(String[] args) {

		Multiple m=new Multiple();
		m.myMethod();
		
		
	}

}
