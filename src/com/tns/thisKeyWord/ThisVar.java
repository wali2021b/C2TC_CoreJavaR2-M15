package com.tns.thisKeyWord;

public class ThisVar {
int age;
String name;
ThisVar(int age, String name)

{
//  age=age;
//  name=name;                            // can't be Assigned this way..
	this.age=age;
	this.name=name;
	//       System.out.println("Hello  "+name +" Your are "+age);    //local or formal values can be used directly here
}
void show()
{
	
	System.out.println("Hello  "+name +" Your are "+age);
}
	public static void main(String[] args) {
ThisVar t1=new ThisVar(23,"Zaid");
t1.show();
		
	}

}
