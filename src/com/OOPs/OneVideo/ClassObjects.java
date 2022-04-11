package com.OOPs.OneVideo;

class Pen{
	String color;
	String type;
	void write()
	{
		System.out.println(type +" pen is writing in : "+this.color+" color");
	}
}
public class ClassObjects {
	

	public static void main(String[] args) {

	Pen p1=new Pen();
	p1.color="Blue";
	p1.type="Ballpoint";
	p1.write();
	Pen p2=new Pen();
	p2.color="black";
	p2.type="Gell";
	p2.write();	
		
	}

}
