package com.tns.WrapperClass;

import java.util.Scanner;

public class NaturalNumb {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("How many natural numbers You want to print..");
		byte num=sc.nextByte();
		for(short i=1;i<=num;i++)
		{
			System.out.print(i+"\t");
		}
	}

}
