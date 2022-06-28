package com.practice.javaPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		int num=5;
		long factorial=1;
		for(int i=num;i>=1;i--) {
			factorial=factorial*i;  //5*4*3*2*1
		}
		System.out.println("factorial of number is:" +factorial);

	}

}
