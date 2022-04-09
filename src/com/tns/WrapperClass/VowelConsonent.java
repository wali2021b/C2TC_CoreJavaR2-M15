package com.tns.WrapperClass;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("enter a character to chech vowel and consonent..");
String ch=sc.next();
System.out.println("Enter Your name please..");
String name=sc.next();
ch=ch.toLowerCase();
boolean vowel=ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u");

if(ch.length()<1)
{
	System.out.println("Opps! "+ name +" it's string, not a character. "+ch.length() );

}
else if(vowel)
{
	System.out.println("Yes this is a Vowel.. "+name);
}
else
{
	System.out.println("It's a consonent.. "+name);
}
sc.close();
	}

}
