package com.practice.javaPrograms.StringOperations;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java      is    a   programming    language";
		System.out.println("Before removing the white spaces:" +str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces:" +str);

	}

}
