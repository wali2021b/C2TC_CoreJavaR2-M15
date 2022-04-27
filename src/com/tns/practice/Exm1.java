package com.tns.practice;

class Test1{
	static int a;
	int b;
	static {
//		a=4;
		System.out.println("static block");
		System.out.println("a= "+a);
	}
	Test1()
	{
		System.out.println("constructor");
		a=10;
	}
	public static void fun()
	{
		a=a+1;
		System.out.println("a= "+a);
	}
}

public class Exm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();

		t.fun();
		System.out.println("Vallue of B is "+t.b);
	}

}
