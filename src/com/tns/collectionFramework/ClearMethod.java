package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

	public static void main(String[] args) {
		List<String> val = new ArrayList<>();
		val.add("JAVA");
		val.add("is");
		val.add("An Interesting");
		val.add("Language");
		
		System.out.println("before clear :" +val);
//		val.clear();
		System.out.println("after clear :" +val);
		
		//containes Method
		List<String> var = new ArrayList<String>();
		var.add("pen");
		var.add("pencil");
		var.add("eraser");
		System.out.println("List " +var);
		boolean res= var.contains("Pencil");
		System.out.println("Is pencil present in the list: " + res);
		System.out.println("size() to know the size of the val : "+val.size());
	}

}
