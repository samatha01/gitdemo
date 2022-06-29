  /*   * * * * *
       * * * * *
       * * * * *
       * * * * *
   */
package com.practice.javaPrograms.patterns;

public class SolidRectangle {                  
	public static void main(String[] args) {
		
		int n=4;    //number of rows
		int m=5;    //number of columns
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
	}

}
