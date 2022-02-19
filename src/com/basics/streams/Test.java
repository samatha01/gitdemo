package com.basics.streams;
import java.util.*;
import java.util.stream.*;
public class Test {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		l.add("Red");
		l.add("Yellow");
		l.add("Green");
		l.add("Violet");
		l.add("Blue");
		l.add("White");
		System.out.println(l);
//		sorting according to length of the string
		Comparator<String> c=(s1,s2)->{
			int l1=s1.length();
			int l2=s2.length();
			if(l1<l2) return -1;
			if(l1>l2) return 1;
			else return s1.compareTo(s2);
		};
		List<String> sortedList=l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedList);
		}

	}


