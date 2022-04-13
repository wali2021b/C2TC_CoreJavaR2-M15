package com.tns.abstractclass;

abstract class Vehical{
	abstract void move();
}
class Honda extends Vehical{
	void move()
	{
		System.out.println("motar bike is moving Safely");
	}
}

public class Demo {

	public static void main(String[] args) {
 Honda h1=new Honda();
 h1.move();
	}

}
