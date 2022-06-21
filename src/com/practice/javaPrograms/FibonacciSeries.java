package com.practice.javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {
         //0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		int num1=0,num2=1,sum=0,term;
		System.out.println("Enter term");
		Scanner sc=new Scanner(System.in);
		term=sc.nextInt();
		System.out.print(num1 +" "+num2);
		for(int i=2;i<term;i++)
		{
			sum=num1+num2;
			System.out.print(" " +sum);
			num1=num2;
			num2=sum;
		}
		sc.close();
	}

}
