package com.tns.controlStatemnts;

public class BreakWhileLoop {

	public static void main(String[] args) {

		int a=1;
		while(a<=10){
		if(a==5)// 5==5
		break; //forceful termination
		System.out.print("\n\tStatement : " + a);//1 2 3 4
		a++;//2
		}
		System.out.print("\n\tEnd of Program."+a);
	}

}
/*
  Statement : 1
  Statement : 2
  Statement : 3
  Statement : 4
  End Of Program.
 */