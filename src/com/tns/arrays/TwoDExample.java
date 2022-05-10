package com.tns.arrays;

public class TwoDExample {
	public static void printing_2D(int mat[][])
	{
	for (int i = 0; i < mat.length; i++){
	for (int j = 0; j < mat[i].length; j++){
	System.out.print(mat[i][j] + " ");
	}
	System.out.println();
	}
	}
	

	public static void main(String[] args) {

		int arr[][]={{1,2,3,9},{2,4,5,8},{4,4,5,10}};
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<4;j++)
		{
		System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("next 2D Array");
		
		int mat[][] = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 } };
				printing_2D(mat);
	}
	
}
