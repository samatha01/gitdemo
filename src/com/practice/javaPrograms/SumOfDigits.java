package com.practice.javaPrograms;

import java.util.Scanner;

//1234  1+2+3+4
public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			sum=sum+num%10; //4+3+2+1
			num=num/10;   //123 12 1
		}
		System.out.println("Sum of digits" +sum);
		sc.close();
	}

}
