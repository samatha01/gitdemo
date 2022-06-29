 
/*                    here i=1 j=1,i=2 j=2...row number=total columns
       * 
       * * 
       * * *
       * * * *       */

package com.practice.javaPrograms.patterns;

public class HalfPyramid {

	public static void main(String[] args) {
		int n=4;    //rows
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
