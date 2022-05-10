package com.tns.collectionFramework;

import java.util.ArrayList;

public class RemoveAllMethod {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list2.add(300);
		list2.add(400);
		System.out.println(list1);
		System.out.println(list2);
		list1.removeAll(list2);
		System.out.println("Value of List 1"+list1);
		System.out.println("Value of List 2"+list2);
		
	}

}
