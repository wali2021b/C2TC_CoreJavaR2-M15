package com.tns.WrapperClass;

import java.util.Scanner;

public class Getch {
public char getch(char a)
{
	return a;
}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Getch c=new Getch();
		System.out.println("this si a getch method");
		char ch=c.getch(sc.next().charAt(0));
		System.out.println(ch);
	}

}
