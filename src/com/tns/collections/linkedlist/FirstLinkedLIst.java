package com.tns.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class FirstLinkedLIst {

	public static void main(String[] args) {

		List<String> link=new LinkedList();
		System.out.println("Initial value of Linked List: "+link);
		link.add("Ravi");
		link.add("Vijay");
		link.add("Ajay");
		System.out.println("After invoking add(E e) method: "+link);
		
	}

}
