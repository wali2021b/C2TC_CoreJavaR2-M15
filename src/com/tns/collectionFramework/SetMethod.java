package com.tns.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {

	public static void main(String[] args) {
List <String> w=new ArrayList();
w.add("Sayyed");
w.add("Waliullah");
w.add("Zaid");
w.add("Rohan");
w.add("Zaki");
w.add("Ali");
System.out.println(w);

w.set(5, "Maya");
System.out.println("Now elements are :\n"+w);
//w.clear();
if(w.isEmpty())
{
	System.out.println("OOPs! Lis is empty..");
}
else
{
	System.out.println("There are only "+w.size()+" Elements in the list");
}
	}

}
