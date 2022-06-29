package com.practice.javaPrograms.arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {40,50,30,10,20,90};
		System.out.println("Array elements before sorting:" +Arrays.toString(a));
		//Arrays.parallelSort(a);
		//System.out.println("Array elements after sorting:" +Arrays.toString(a));
       // Arrays.sort(a);
		//approach2      Descending order
		Integer a1[]= {40,50,30,10,20,90};
		Arrays.sort(a1,Collections.reverseOrder());
        System.out.println("Array elements after sorting:" +Arrays.toString(a1));
	}

}
