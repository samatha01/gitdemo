package com.practice.javaPrograms.search;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90};//should be in sorted order
		int l=0,h=a.length-1;  //l low h high
		int key=20;          //element to be searched
		boolean flag=false;
		while(l<=h) {
			int m=(l+h)/2; //mid value index
			if(key==a[m]) {       //a[m]=mid value
				System.out.println("Element found at index:"+m);
				flag=true;
				break;
			}
			if(a[m]>key) {
				h=m-1;
			}
			if(a[m]<key) {
				l=m+1;
			}
		}
		
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
	
}
