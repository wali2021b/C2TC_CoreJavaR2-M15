package com.tns.controlStatemnts;

public class PredictOP5 {
	static int c;
	static int show()
	{
		System.out.println(c);
		c=10;
		return c;
	}

	public static void main(String[] args) {

		boolean b = false;
		int a;
//		if (PredictOP5.c<10) 
		if(b=true){
		System.out.println("HELLO");
		} else {
		System.out.println("BYE");
		}
		System.out.println(PredictOP5.c);
		System.out.println("Mehodds value :  "+PredictOP5.show());
	}

}
