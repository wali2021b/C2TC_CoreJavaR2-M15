package com.tns.abstractclass;

abstract class Nokia{
	abstract void switchOff();
	Nokia(){
		System.out.println("Constructor is created.");
	}
	
}
 
public class Mobile  extends Nokia{
	
  void switchOff()
	{
	 System.out.println("Turning Off");
	}
	

	public static void main(String[] args) {

		Nokia n1=new Mobile();
		n1.switchOff();
		
	}

}
