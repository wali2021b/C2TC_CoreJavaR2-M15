package com.tns.thisKeyWord;

public class InvokeConstructor {
	InvokeConstructor()
	{
		m(this);
		System.out.println("Hello world..");
	}
	InvokeConstructor(InvokeConstructor a)
	{
		this();
		System.out.println("How it would be invoked.. "+a);
	}
void m(InvokeConstructor a)
{
	System.out.println("constructor ivoked using Object parameter."+a);
}
	public static void main(String[] args) {

		InvokeConstructor a=new InvokeConstructor();
		System.out.println("first Constructor... k baad ka ");
		InvokeConstructor b= new InvokeConstructor(a);
		
	}

}
