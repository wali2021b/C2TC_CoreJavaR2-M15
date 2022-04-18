package com.tns.stringClass;

public class CreatingString {

	public static void main(String[] args) {

		String s=new String("Waliullah");
		String s2=new String ("Waliullah");
//		s=s2;                                // copying refrences ..
		System.out.println(s==s2);
	}

}
