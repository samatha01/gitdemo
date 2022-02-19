package com.basics.streams;
import java.util.*;
import java.util.stream.*;

public class StreamClass {

	public static void main(String[] args) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("Sunny");
		l.add("Bunny");
		l.add("Vinny");
		l.add("John");
		l.add("Jane");
		List<String> sortedList=l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
//		to sort in descending order
		List<String> sortedListDesc=l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(sortedListDesc);
	}

}
