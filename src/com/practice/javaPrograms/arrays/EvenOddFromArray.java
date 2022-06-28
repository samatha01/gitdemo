package com.practice.javaPrograms.arrays;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,4};
		System.out.println("even numbers in array:");
		/*for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("odd numbers in array:");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/
		//even numbers using enhanced for loop
		for(int value:a) {
			if(value%2==0)
				System.out.println(value);
		}
		//odd numbers using enhanced for loop
		System.out.println("odd numbers");
		for(int value:a) {
			if((value%2)!=0)
				System.out.println(value);
		}

	}

}
