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
	String name="ABC";
	Emp()
	{
		System.out.println("Employee constructor..");
	}
	void place()
	{
		System.out.println(name+" Working in "+ Work_palce);
	}
	
	class Programmar extends Emp{
		
		Programmar()
		{
		  System.out.println("Programmar Constructor Or the Grand Son class..");
		}
		void code()
		{
			System.out.println(name+" Is a good Coder and Programmar of the company..");
		}
	}
	
}
public class MultiLevel {

	public static void main(String[] args) {
//		Programmar p1= new Programmar();
//	Programmar pp= new Programmar();
		Emp e1=new Emp();
		e1.place();

	}

}
