package com.practice.javaPrograms;

import java.util.Scanner;

public class PallindromeNumber {
//121
	public static void main(String[] args) {
		int n,sum=0,temp,r;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
        if(temp==sum)
        {
        	System.out.println("The given number is Pallindrome");
        }
        else
        {
        	System.out.println("Not Pallindrome number");
        }
        sc.close();
	}

}
