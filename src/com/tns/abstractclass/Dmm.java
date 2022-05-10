package com.tns.abstractclass;

abstract class Bike{
	abstract void run();
}
class Yamaha extends Bike{
	void run()
	{
		System.out.println("Bike is running Safely..");
	}
	void stop()
	{
		System.out.println("Break Applied..");
	}
}

public class Dmm {

	public static void main(String[] args) {

		Yamaha b=new Yamaha();
		b.run();
		b.stop();
		
	}

}
