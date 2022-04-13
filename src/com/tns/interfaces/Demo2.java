package com.tns.interfaces;

interface vehicle2{
	int x=10;           // static and final are assigend before int automatically.. in interface..
	default void engine() {
		System.out.println("x= "+x+ " Default access modifier and static key word enables declaration in the interface..");
	}
}
 class Bike1 implements vehicle2
{
//	 public void engine()
//	 {
//		 System.out.println("Super engine ..");
//	 }
 }


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b=new Bike1();
		b.engine();
	  vehicle2 v2=new Bike1();
	  v2.engine();
	  
	}

}
