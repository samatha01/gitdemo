package com.practice.javaPrograms;

import java.util.Scanner;

public class Sum_Odd_Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		int i,odd_sum=0,even_sum=0;
		for(i=0;i<size;i++)
			arr[i]=sc.nextInt();
		for(i=0;i<size;i++)
			if(arr[i]%2==0)
				even_sum=even_sum+arr[i];
			else
				odd_sum=odd_sum+arr[i];
		System.out.println("Sum of even numbers:" +even_sum);
		System.out.println("Sum of odd numbers:" +odd_sum);
        sc.close();
	}

}
