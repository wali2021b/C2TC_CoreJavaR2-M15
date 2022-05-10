package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMethod {
	public static void main(String[] args) {
//		List<String> list=new ArrayList<>();
		List<String> arrlist = new ArrayList<>();
		arrlist.add("java");
		arrlist.add("Technical");
		arrlist.add("webinar");
		System.out.println("List elements before Replacements: "+arrlist);
		Collections.fill(arrlist,"JavaScript");
		System.out.println("List elements After Replacements: "+arrlist);
	}

}
