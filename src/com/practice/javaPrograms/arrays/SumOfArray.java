package com.practice.javaPrograms.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {5,6,4,3,2,1,50};
		int sum=0;
		/*for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}*/
		//enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println("sum of array elements: "+sum);

	}

}
