package com.tns.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod {

	public static void main(String[] args) {

		List<String> val=new ArrayList();
//		List va=new ArrayList<>();
		val.add("ali");
		val.add("zaki");
		val.add("wali");
		val.add("siraj");
		System.out.println("Before Sorting.. : "+val);
//		Collections.sort(val);
		Collections.rotate(val, 1);
		System.out.println("After Sorting.. : "+val);
//		Collections.fill(val,"College");
		
		System.out.println("After fill method : "+ val);
		System.out.println(val.lastIndexOf("wali"));
		System.out.println("For Loop is printing..: "+val);
		for(int i=0;i<val.size();i++)
		{
			System.out.print(val.get(i)+"\t");
		}
	}

}
