package com.practice.javaPrograms;

import java.util.Scanner;

public class GcdDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a!=0 && b!=0) {
			
		while(a%b!=0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		System.out.println("GCD:" +b);
		}
		else
		{ 
			System.out.println("enter appropriate integer values");
		}
		sc.close();

	}

}
