package com.practice.javaPrograms;

import java.util.Arrays;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		int arr[]= {19,6,8,15,6,8,24};
		int output=FirstRepeatingElement.getFirstRepeatingElement(arr);
		if(output==-1) {
			System.out.println("There is no first repeating element");
		}
		else {
			System.out.println("First repeating element->" +output);
		}

	}

	private static int getFirstRepeatingElement(int[] arr) {
		int input[]=arr;
         System.out.println("Input element");
         System.out.println(Arrays.toString(input));
         int length=input.length;
         for(int i=0;i<length;i++) {
        	 for(int j=0;j<length;j++) {
        		 if(i!=j && input[i]==input[j]) {
        			 return input[i];
        		 }
        	 }
         }
		return -1;
	}

}
