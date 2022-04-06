package com.tns.M15;


public class StaticVar {
	int id;
	String name;
	static String college="JIEMS";
StaticVar(int r,String n)
{
	id=r;
	name=n;
}
public void display()
{
	System.out.println(id+" "+name+ " From "+college);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World...");
		StaticVar s1=new StaticVar(1,"Sayyed");
		s1.display();
		StaticVar s2= new StaticVar(2,"Aman");
		System.out.println("After Changing the Class variable / Static Variable Value..");
		StaticVar.college="Jamia";
		s1.display();
		s2.display();
	}
	

}
