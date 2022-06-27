package com.practice.javaPrograms.arrays;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"java","c","c++","python","corejava","java"};
		boolean flag=false;
		//Approach1
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate element found:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("duplicate element not found");
		}*/
		//Approach2   using HashSet.Hashset will return false if we add duplicates
		HashSet<String> langs=new HashSet<String>();
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Found duplicate element: " +l);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Not found duplicates");
		}

	}

}
