package com.tns.inheritance;

class Father
{
	public void snore()
	{
		System.out.println(" sonoring is inherited from Father...");
	}
	
public	class Son extends Father{
		
		void habit()
		{
			System.out.println("All the habits of son only..");
		}
	
		
	}
	
	class Daughter extends Father{
		void habit()
		{
			System.out.println("All the Habits of Daughters only...");
		}
	}
}

public class HierarchicalInheritance  {
	static void show()
	
	{
		System.out.println("this is a class Mehtods means no need object to invoke it ..\n directly call karo..");
	}

	public static void main(String[] args) {

//		Son s1=new Son();
//		Daughter d1=new Daughter();
		
		show();
		
		
	}

}
