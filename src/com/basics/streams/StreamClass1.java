package com.basics.streams;
import java.util.*;
import java.util.stream.*;
public class StreamClass1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(20);
		l.add(5);
		l.add(10);
		l.add(15);
		System.out.println(l);
		Integer min=l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max=l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);

	}

}
