package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ludo {

	public static void main(String[] args) {

		List<Integer> ludo=new ArrayList<Integer>();
		ludo.add(1);ludo.add(2);ludo.add(3);ludo.add(1);
		ludo.add(4);ludo.add(5);ludo.add(6);ludo.add(6);
//		System.out.println("Before Shuffling..."+ludo);
//		Collections.shuffle(ludo);
//		System.out.println("Result after Shuffle.."+ludo);
//		Collections.shuffle(ludo);
//		System.out.println("Result after Shuffle.."+ludo);
//		
//		Collections.shuffle(ludo);
//		System.out.println("Result after Shuffle.."+ludo);
//		System.out.println(ludo.get(0));
		int c=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("You got..");
			Collections.shuffle(ludo);
			switch(ludo.get(0))
			{
			case 1:
				System.out.println(1);
				break;
			case 2:
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			
		case 4:
			System.out.println(4);
			break;
		case 5:
			System.out.println(5);
			break;
		case 6:
			System.out.println(6);
			break;
		}
	System.out.println("play more just press any number >0 \npress 0 to exit");
	c=sc.nextInt();
		
//		System.out.println();
			
		}while(c>0);
		System.out.println("The End..");
		sc.close();
	}

}
