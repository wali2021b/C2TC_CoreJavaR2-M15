package com.tns.inheritance;
class Family{
	String name;
	String gender;
    byte age;
   
    void setName(String name) {
    	this.name=name;
    	
    }
	
	
	
}
class Members extends Family{
	String surName="Sayyed";
	void show()
	{
		System.out.println( "Hello "+ this.name +" You Belong to "+ surName +" Family.");
	}
	
}

public class SingleLevel {

	public static void main(String[] args) {

		Members m1=new Members();
		m1.setName("Waliullah");
		m1.show();

		Members m2=new Members();
		m2.setName("Moin");
		m2.show();
	}

}
