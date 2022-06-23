package com.practice.javaPrograms;

import java.util.Scanner;

public class SumOfTwoBinaryNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first binary number");
		String x=sc.next();
		System.out.print("Enter first binary number");
		String y=sc.next();
		sc.close();
		int n1=Integer.parseInt(x, 2);
		int n2=Integer.parseInt(y, 2);
		int n3=n1+n2;
		System.out.println("n1:"+Integer.toBinaryString(n1));
		System.out.println("n2:"+Integer.toBinaryString(n2));
		System.out.println("n3=n1+n2:"+Integer.toBinaryString(n3));

	}

}
