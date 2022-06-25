package com.practice.javaPrograms.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a1= {10,20,30,35,40,44,50,70};
		int key=50;
		System.out.println(key +"is found at index:" +linearSearch(a1,key));

	}


	public static int linearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
}
	
	


