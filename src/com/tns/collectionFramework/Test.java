package com.tns.collectionFramework;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(3);

		l.add(5);
		l.add(9);


		
		Collections.reverse(l);
		Collections.sort(l);
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
