package com.tns.interfaces;

interface vehicle{
	
	void engine();
}
 class Bike implements vehicle
 {
	 public void engine()
	 {
		 System.out.println("Super engine hai..");
	 }
 }


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v=new Bike();
v.engine();
	}

}
