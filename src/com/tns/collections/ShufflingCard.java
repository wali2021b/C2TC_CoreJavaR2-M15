package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShufflingCard {

	public static void main(String[] args) {
		List cards=new ArrayList();
		
Scanner sc=new Scanner(System.in);
		System.out.println("How many Cards ??");
	 int num=sc.nextInt();
	 for(int i=0;i<num;i++)
	 {
		 cards.add(i,i+1);
	 }
	 System.out.println("Before Shuffling.. : "+cards);
	 Collections.shuffle(cards);
	 System.out.println("After Shuffling.. : "+cards);
	}
	

}
