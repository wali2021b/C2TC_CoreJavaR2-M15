package com.tns.controlStatemnts;

public class BreakInnerLoop {

	public static void main(String[] args) {

		for(int i=1;i<=3;i++)
			// 1, 2 , 3
	{
			for(int j=1;j<=3;j++) //1 2
		{
			if(i==2&&j==2)
			{
			break; //forceful termination on inner for loop
			}
			System.out.print(i+" "+j+"\t"); //11, 12, 13
			//21,
			//31, 32, 33
		}
			System.out.println();
	}

}
}
/*
1 1	1 2	1 3	
2 1	
3 1	3 2	3 3	

 
 */
