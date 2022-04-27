package com.tns.stringClass;

public class LastIndexOf {

	public static void main(String[] args) {

		String str="This is simple String.";
		String str1="Hello world";
		System.out.println(str.lastIndexOf("."));
		for(int i=0;i<=str.lastIndexOf(".");i++)
		{
			System.out.print(str.charAt(i)+" ");
			
		}
		System.out.println(str.lastIndexOf("."));
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.charAt(20));
		System.out.println(str.concat(str1));
	}

}
