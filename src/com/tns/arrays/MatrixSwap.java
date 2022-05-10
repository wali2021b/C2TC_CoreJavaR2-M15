package com.tns.arrays;
//Java program to interchange elements of first and last row in 3*3 matrix.
import java.util.Scanner;

public class MatrixSwap {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("enter array  elements");
		for(int i=0; i<a.length;i++)
		{for(int j=0; j<a.length;j++) {
		a[i][j]=sc.nextInt();
		}}
		for(int i=0; i<a.length;i++)
		{
		for(int j=0; j<a.length;j++)
		{
		System.out.print(a[i][j] + " ");
		}
		System.out.println();
		}
  for(int i=0;i<a.length;i++)
 {
	int t=a[0][i];
	a[0][i]=a[2][i];
	a[2][i]=t;
	
 }
  System.out.println("Matrix After Wapping..");
  
  for(int i=0; i<a.length;i++)
	{
	for(int j=0; j<a.length;j++)
	{
	System.out.print(a[i][j] + " ");
	}
	System.out.println();
	}
}
}
