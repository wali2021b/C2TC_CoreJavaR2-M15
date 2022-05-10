package com.tns.abstractclass;
abstract class Shape{
	abstract void draw();
	static void abb() {
		System.out.println("this is a Static method inside shape class..");
	}
}
class Rectangle extends Shape{
	void draw()
	{
		System.out.println("Rectangle displayed on the screen.");
	}
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("Circle displayed on the screen.");
	}
}
public class Draw {

	public static void main(String[] args) {

		Shape r1=new Rectangle();
		Shape c1=new Circle();
		r1.draw();
		c1.draw();
		r1.abb();
		Shape.abb();
		
	}

}
