package com.tns.abstractclass;

abstract class TowTier{
	 public void run()
	 {
		 System.out.println("bothe the tires are working Fine...");
	 }
	 abstract void engin();
}
public class Cycle extends TowTier {

	public static void main(String[] args) {

	Cycle gc=new Cycle();
	gc.run();
	gc.engin();
	}

	@Override
	void engin() {
		System.out.println("Gear Cycle does not require any Engine.");
	}

}
