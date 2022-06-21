package com.practice.javaPrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n ,sum=0;
		System.out.println("Enter n value");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sum=(n*(n+1))/2;
		System.out.println("sum of " +n+" " +"natural numbers is "+sum);
        sc.close();
	}

}
