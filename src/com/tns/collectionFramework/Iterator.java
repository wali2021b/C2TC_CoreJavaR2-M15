package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		List<Integer> val1 = new ArrayList<>();
		val1.add(0);
		val1.add(11);
		val1.add(23);
//		Iterator z=val.iterator();
//		while(z.hasNext())
//		{
//		System.out.print(z.next());}
		System.out.println("ArrayList : " + val1);
		val1.remove(0);
		System.out.println("ArrayList : " + val1);
		
	List <Integer> val2= new ArrayList();
	val2.add(10);
	val2.add(21);
	val2.add(33);
	System.out.println("ArrayList : " + val2);
	val2.addAll(val1);
	System.out.println("ArrayList : " + val2);
//	val2.remove();
	
	}

}
