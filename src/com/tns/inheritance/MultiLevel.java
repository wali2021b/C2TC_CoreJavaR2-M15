package com.tns.inheritance;
class Person{
	String nation="India";
	public Person() {
		System.out.println("Person constructor..");
	}
	void nationality()
	{
		System.out.println("You are froma"+this.nation);
	}
}
class Emp extends Person{
	String Work_palce="Mumbai";
	Emp()
	{
		System.out.println("Employee constructor..");
	}
	void place()
	{
		System.out.println("Working in "+ Work_palce);
	}
	
}
public class MultiLevel {

	public static void main(String[] args) {

	}

}
