package com.basics.functional;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
           l.add(30);
           l.add(15);
           l.add(0);
           l.add(20);
           l.add(10);
           System.out.println(l);
         Comparator<Integer> c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;      //using lambda expression to compare elements and result in ascending order
         Collections.sort(l,c);
         System.out.println(l);
	}

}
