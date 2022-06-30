package com.practice.javaPrograms;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n+ "*" +i + "=" +(n*i));   //8*1=8    to 8*10=80
		}
        sc.close();
	}
	

}
