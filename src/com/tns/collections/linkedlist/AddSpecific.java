package com.tns.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class AddSpecific {

	public static void main(String[] args) {

		List<String> ll=new LinkedList();
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking add(E e) method: "+ll);
		ll.add(1, "Gaurav");    //index one pe..  index always starts from Zero..
		System.out.println("After invoking add(int index, E element) method: "+ll);
	}

}
