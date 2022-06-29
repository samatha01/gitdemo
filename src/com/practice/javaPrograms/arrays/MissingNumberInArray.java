package com.practice.javaPrograms.arrays;
//array should not have duplicates
//values should be in a range
public class MissingNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};    //5 is missing
		//sum1=1+2+3+4+6=16  sum1
		//sum2=1+2+3+4+5+6=21  sum2
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in the array: "+sum1);
		int sum2=0;
		for(int i=1;i<=6;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements in the array: "+sum2);
		System.out.println("missing number is: "+(sum2-sum1));
	}

}
