package com.tns.thisKeyWord;

public class Demo {
	Demo()
	{
		System.out.println("non-parameterized constructor has been invoked.");
//		this(10);
	}
	Demo (int a)
	{
		this();
		System.out.println("Your Value is : "+a);
	}

	public static void main(String[] args) {
		
Demo d1=new Demo(11);

	}

}
