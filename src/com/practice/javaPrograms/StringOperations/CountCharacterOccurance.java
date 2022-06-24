package com.practice.javaPrograms.StringOperations;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s="Java Programming Java oops";
		int totalCount=s.length();     //total length
		int totalCount_After_Removing_a=s.replace("a","").length(); //total length after removing 'a'
		int count=totalCount-totalCount_After_Removing_a;
		System.out.println("Number of occurances of a is:" +count);

	}

}
