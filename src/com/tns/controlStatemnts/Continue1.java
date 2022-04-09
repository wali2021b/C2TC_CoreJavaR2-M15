package com.tns.controlStatemnts;

public class Continue1 {

	public static void main(String[] args) {

		for(int i = 0; i<= 2; i++) {
			for (int j = i; j<=5; j++) {
			if(j == 4) { //4==4
			continue; //forecful iteration
			}
			System.out.print(j+"\t"); //01235 1235 235
			}
			System.out.println();
	}

}
}