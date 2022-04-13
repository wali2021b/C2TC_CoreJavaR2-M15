package com.tns.patterns;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=i-n;)
			{
				if(j<=n)
				{
					System.out.print("* ");
					j++;
				}
//				else
//				{
//					j--;
//				}
			}
			System.out.println();
		}
	}

}
