package com.practice.javaPrograms.StringOperations;

public class StringToIntegerArray {

	public static void main(String[] args) {
		String[] myGrades= {"89","90","88","96","100"};
		int[] myNumerizedGrades=new int[myGrades.length];
		for(int i=0;i<myNumerizedGrades.length;i++) {
			myNumerizedGrades[i]=Integer.parseInt(myGrades[i]);
		}
		System.out.println(myNumerizedGrades[2]+myNumerizedGrades[4]);    //188

	}

}
