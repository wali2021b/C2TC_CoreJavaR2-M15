package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddElement {

	public static void main(String[] args) {

		List<String> val=new ArrayList();
		List va=new ArrayList<>();
		val.add("wali");
		val.add("ali");
		val.add("zaki");
//		va.addAll(val);
		System.out.println(val.size());
		System.out.println(va);
		System.out.println(val.contains("ali"));
		List val2=val.subList(0, 2);
		System.out.println(val2);
		Collections.rotate(val, 1);
		System.out.println(val);
		Collections.shuffle(val2);
		System.out.println("After shuffling.."+val2);
	}

}
