package com.basics.streams;
import java.util.*;
import java.util.stream.*;
public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(40);
		marks.add(20);
		marks.add(30);
		marks.add(80);
		System.out.println(marks);
		List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList())	;
		System.out.println(updatedMarks);
		List<Integer> sortedList=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
