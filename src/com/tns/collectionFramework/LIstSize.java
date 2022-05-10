package com.tns.collectionFramework;
import java.util.ArrayList;
public class LIstSize {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(15);
		arrlist.add(20);
		arrlist.add(25);
		arrlist.add(22);
		int value = arrlist.size();
		System.out.println(" size of the list is : "+value);
		arrlist.add(null);
		arrlist.add(23);
		arrlist.add(00);
		value = arrlist.size();
		System.out.println(arrlist+"\n now size of the list is : "+value);
//		for(int i=0;i<arrlist.size();i++)
//		{
//			System.out.print(arrlist[i]+"\t");
//		}
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		arrlist.clear();
		arrlist.addAll(list1);
		value = arrlist.size();
		System.out.println(arrlist+"\n now size of the list is : "+value);
		
	}

}
