package com.practice.javaPrograms.StringOperations;

public class StringToByteArray {

	public static void main(String[] args) {
		String s="Hello Java Developers";
		//string to byte array
		byte strBytes[]=s.getBytes();
		System.out.println(strBytes);
       //byte array to string
		String s1="Welcome to Java";
		byte[] bytes=s1.getBytes();  //get bytes
		String myString=new String(bytes);  //converting bytes to string
		System.out.println("String Example:"+myString);
	}

}
