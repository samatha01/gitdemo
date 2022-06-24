package com.practice.javaPrograms;

import java.util.Scanner;

//input first number 10
//input second number 20
//prime numbers ->11,13,17,19
public class PrimeNumberRange {

	public static void main(String[] args) {
		int n1,n2,i,j;
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
				System.out.println(j);
		}

	}

}
