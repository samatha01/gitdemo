package com.practice.javaPrograms.arrays;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		int a[]= {50,89,67,54,90,88};
		/*int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum element:"+max);*/
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
	}
		System.out.println("minimum element:" +min);
	}

}
