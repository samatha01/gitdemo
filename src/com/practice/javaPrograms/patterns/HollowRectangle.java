   /* *****
      *   *
      *   *
      *****
    */
package com.practice.javaPrograms.patterns;

public class HollowRectangle {

	public static void main(String[] args) {
		int n=4;    //number of rows
		
		int m=5;    //number of columns
		for(int i=1;i<=n;i++) {
			//cell(i,j)
			for(int j=1;j<=m;j++) {
				if(i==1 || j==1 || i==n || j==m)
				{ 
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}

	}

}
