package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cloning {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(222);
		list.add(44);
		list.add(33);
		list.add(55);
		System.out.println(list);
		Collections.sort(list);
		
		ArrayList<String> ww=new ArrayList<String>();
		ww.add("wali");
		ww.add("ff");
		
		Object var1=ww.clone();
		System.out.println(var1);
//		Object var2=list.clone();                      //error ?? only ArrayList type pe cloning possible??
//		list.addAll(ww);
		System.out.println(	list.addAll(ww));
		System.out.println(	list +" " +list.addAll(ww));
	}

}
