package com.tns.abstractclass;

abstract class ICIC{
	ICIC()
	{
		System.out.println("New bank has been Created...");
	}
	void run(){
		System.out.println("Bank is running");
	}
	
}
abstract class Bank extends ICIC{
	abstract float rateOfInterest();
	
}
class SBI extends Bank{

	@Override
	float rateOfInterest() {
		return 7.3f;
	}
	
}

class HDFC extends Bank{

	@Override
	float rateOfInterest() {
		return 8.1f;
		
	}
	
}
public class Interest {

	public static void main(String[] args) {

		SBI s1=new SBI();
		HDFC h1=new HDFC();
		System.out.println("Rate of interest in sbi is :"+s1.rateOfInterest());
		System.out.println();
		System.out.println("Rate of interest in HDFC is :"+h1.rateOfInterest());
	s1.run();
	}

}
