package com.practice.javaPrograms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num=123456;
		int odd_count=0;
		int even_count=0;
		while(num>0) {
			int rem=num%10;  //5 4 3 2 1
			if(rem%2==0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even numbers: "+even_count);
		System.out.println("Number of odd numbers: "+odd_count);
	}
}
