package com.practice.javaPrograms;

import java.util.SortedSet;
import java.util.TreeSet;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {1,5,4,2,8,1,8,9,9};
			
		//To remove duplicates
		//tree set sorted in ascending order by default
		SortedSet<Integer>set=new TreeSet<>();       
		for(Integer i:arr) {
			set.add(i);
		}
		System.out.println(set); //1,2,4,5,8,9
		 set.remove(set.last());  //removing largest numb. i.e 9
		 System.out.println(set.last());

	}

}
