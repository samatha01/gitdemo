package com.basics.streams;

import java.util.*;
import java.util.stream.*;
public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		l.add(25);
		l.add(15);
		l.add(0);
		System.out.println(l);
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList())	;
//		list of even numbers.
	    System.out.println(l2);
//	    to count numbers greater than 20. from list l.
	    long  l3=l.stream().filter(i->i>20).count();
	    System.out.println(l3);
	}

}
