package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class SubListMethod {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("1");
		arrlist.add("2");
		arrlist.add("3");
		arrlist.add("Random");
		arrlist.add("click");
		System.out.println("Actual ArrayList:"+arrlist);
		List<String> list = arrlist.subList(0, 4);
		List<String> str;
		str=arrlist.subList(1,3);
		System.out.println("Sub List: "+list);
		System.out.println("Sub list of str :"+str);
	}

}
