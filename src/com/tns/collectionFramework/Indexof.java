package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Indexof {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("JAVASCRIPT");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		System.out.println(list);
		System.out.println("Indexo of Java is : "+list.indexOf("JAVA"));
		System.out.println("Last Indexo of Java is : "+list.lastIndexOf("JAVA"));
	}

}
