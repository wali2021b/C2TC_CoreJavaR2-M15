package com.tns.controlStatemnts;

public class PredictOp5 {

	public static void main(String[] args) {
		int x = 2;
		int y = 0;
		for (; y < 10; ++y) {
		if (y % x == 0)
		continue;
		else if (y == 8)  // this block will never run as continue hoga  8 k liye bhi...
		{
		System.out.println("break hua");	
			break;
		}
		else
		System.out.print(y + " ");
		}

}
}