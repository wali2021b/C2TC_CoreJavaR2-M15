package com.tns.collections;

import java.util.ArrayList;
import java.util.List;

public class InsertingValues {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(0);
		System.out.println("List values befor insertions..: "+list);
//		int table=13;
		int table=19;
		for(int i=1;i<=10;i++)
		{
			list.add(i*table);
		}
		System.out.println("Talbe of : "+table +" is : "+list);

		list.set(0,"Table values: ");
		list.add(2,"wali");
		System.out.println("Talbe of : "+table +" is : "+list);
		
			
		
	}

}
