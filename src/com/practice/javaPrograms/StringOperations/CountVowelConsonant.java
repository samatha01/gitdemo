package com.practice.javaPrograms.StringOperations;

public class CountVowelConsonant {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String str="Welcome to java";
		//converting entire string to lower case to reduce the comparisons
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++) {
        	//checks whether a character is vowel
        if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
        {
        	//increments the vowel counter
        	vCount++;
        }
        //checks whether a character is consonant
        else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
        {
        	//increments the consonant counter
        	cCount++;
        }
        }
        System.out.println("Number of vowels :"+vCount+"Number of consonants:"+cCount);
        }
	}


