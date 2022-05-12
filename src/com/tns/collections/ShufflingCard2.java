package com.tns.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ShufflingCard2 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
				Scanner s=new Scanner(System.in);
				System.out.println("how many cards..?");
				int num=s.nextInt();
				while(num!=0)
				{
					if(num>1)
					System.out.println("Enter : "+ num+"th card");
					else
						System.out.println("Enter : "+ num+"st card");
				list.add(s.nextInt());
				num--;
				}
				System.out.println("your cards..: "+list);
				Collections.shuffle(list);
				System.out.println("shuffled cards.. "+list);
	}

}
