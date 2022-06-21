package com.practice.javaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("values of a & b before swapping are: a=" +a +" b=" +b);
		/*int temp=a;//swapping numbers using third variable
		a=b;
		b=temp;*/
		a=a+b; //swapping numbers without using third variable
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping are: a=  "+a +" b=" +b);

	}

	
}
