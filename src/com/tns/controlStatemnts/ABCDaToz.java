package com.tns.controlStatemnts;

import java.util.Scanner;

public class ABCDaToz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		char chs='a';
		Scanner sc=new Scanner(System.in);
		System.out.println("How many alphabets You want to print ");
		int limit=sc.nextInt();
		System.out.println("CAPITAL Letters");
		for(int i=1;i<=limit;i++)
		{
			if(limit >26 && i >=26)
			{
				System.out.println("\nOh! There are only 26 letters in English alphabet");
				break;
			}
			System.out.print(ch++ +" ");
		}
		System.out.println("\nSmall Letters");
		for(int i=1;i<=limit;i++)
		{
			if(limit >26 && i >=26)
			{
				System.out.println("\nCan't display "+limit+" Alphabets as  There are only 26 letters in English alphabet");
				break;
			}
			System.out.print(chs++ +" ");
		}

	}

}
