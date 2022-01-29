package com.basics.demo;

import java.util.Arrays;

public class StringHandlingDemo {

	public static void main(String[] args) {
		String str1="Sea is full ";
		String str2="of pearls";
		System.out.println(str1.length());
		String result=str1.concat(str2);
		System.out.println(result);
		if(str1.equals(str2)) {
			System.out.println("Both strings are same");
		}else {
			System.out.println("Both strings are different");
		}
        System.out.println(str1.indexOf('f'));
        System.out.println(str1.replace('s','z'));
        String arr[]=str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));
        String newStr1=str1.substring(0,3);
        System.out.println(newStr1);
        System.out.println(str1.charAt(4));
	}

}
