package com.practice.javaPrograms;

import java.util.Scanner;

public class LcmDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int g=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
				g=i;
		}
         int lcm=a*b/g;
         System.out.println("Lcm" +lcm);
         sc.close();
	}

}
