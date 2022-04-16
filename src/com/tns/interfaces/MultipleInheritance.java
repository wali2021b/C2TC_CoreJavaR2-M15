package com.tns.interfaces;

interface Inf1
{
public void method1();
}

interface Inf2
{
public void method2();
}

public class MultipleInheritance implements Inf1,Inf2{
	public void method1() {
		System.out.println("This is implementation of Method1..");
		
	}
	public void method2()
	{
		System.out.println("This is implementation of Method2..");
		
	}

	static void sum()
	{
		System.out.println("this method can be used to add numbers..");
	}
	
	

	public static void main(String[] args) {

		MultipleInheritance m1= new MultipleInheritance();
		m1.method1();
		m1.method2();
		sum();
	}

}
