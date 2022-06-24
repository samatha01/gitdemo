package com.practice.javaPrograms.StringOperations;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="$$&&$##333@Java 0567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
