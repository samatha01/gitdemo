package com.practice.javaPrograms.StringOperations;

import java.util.Arrays;

public class Anagram {
     //same characters in two strings i.e anagram
	public static void main(String[] args) {
		String str1="Brag";
		String str2="Grab";
		//converting both the strings to lower case
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		//checking for the length of strings
		if(str1.length()!=str2.length()) {
			System.out.println("Both the strings are not anagram");
		}
		else {
			//converting both strings to character array
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			//sorting the arrays using function sort()
			Arrays.sort(string1);
			Arrays.sort(string2);
			//comparing both the arrays using equals()
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Both the strings are anagram");
			}
			else
			{
				System.out.println("Both the strings are not anagram");
			}
			
		}

	}

}
