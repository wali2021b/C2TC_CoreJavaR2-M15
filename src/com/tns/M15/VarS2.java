package com.tns.M15;
//implementation of Static member/methods can change the value of static variable...
public class VarS2 {
	int R_no=0;
	static String branch="CS";
	VarS2()
	{
		System.out.println("None parameterized constructor will assin same data...");
//		R_no=0;
		R_no+=1;
	}
	void show()
	{
		System.out.printf("Id: %d \t Branch:%s\n",R_no,branch);
		
	}
	static void reName()
	{
		branch="CS-IT";
	}

	public static void main(String[] args) {

	VarS2 v,vv;
	VarS2 v1=new VarS2();
	v1.show();
//	v1.reName();          it can not be as it's static methods..
	VarS2.reName();     // once changed now for all the objects value will have been changed...
	v1.show();
	v= new VarS2();
	vv=new VarS2();
	v.show();
	vv.show();
	
	}

}
