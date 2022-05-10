package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rotate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("practice");
		list.add("code");
		list.add("every");
		list.add("day");
		System.out.println("Original List : " + list);
//		Collections.rotate(list, 5);
		System.out.println("Rotated List: " + list);
		Collections.shuffle(list);
		System.out.println("Results after shuffle operation:"+ list);
	}

}
