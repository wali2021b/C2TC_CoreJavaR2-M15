package com.tns.interfaces;

interface Activa
{
 void getMileage() ;
}
class R15 implements Activa
{
public void getMileage()
{
System.out.print("Mileage is 40 Km/L");
}
}
public class Example1 {

	public static void main(String[] args) {

		R15 bike = new R15();
		bike.getMileage();
	}

}
