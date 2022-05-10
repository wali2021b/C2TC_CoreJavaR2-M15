package com.tns.interfaces;

interface Bikki{
	String color="Yellow";
	int getMilage();
}
public class ColorP implements Bikki {
	

	public static void main(String[] args) {

		ColorP p1=new ColorP();
		System.out.println("Mileage of the bike is :"+p1.getMilage());
		System.out.println("And color of the bike is :"+p1.color);
		System.out.println("Right way to access static values is: using class.property :"+ColorP.color+ " \t"+ Bikki.color);
	}

	@Override
	public int getMilage() {
		return 45;
	}

}
