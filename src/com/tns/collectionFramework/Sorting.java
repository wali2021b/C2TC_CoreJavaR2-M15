package com.tns.collectionFramework;
import java.util.*;

public class Sorting {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	list.add(80);
	list.add(05);
	list.add(32);
	list.add(2);
	System.out.println("List items before sorting.."+list);
	Collections.sort(list);
	System.out.println("List After Sorting....."+list);
	Collections.shuffle(list);
	System.out.println("List items before sorting.."+list);
	Collections.sort(list);                                           //Ascending Order  A-Z
	System.out.println("");
	 Collections.sort(list,Collections.reverseOrder());               //Descending Order Z-A
	 System.out.println("List After Sorting....."+list);
}
}
