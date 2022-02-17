package com.basics.bifunction;
import java.util.function.*;
public class Test1 {

	public static void main(String[] args) {
		BiPredicate<Integer,Integer> p=(a,b)->(a+b)%2==0;
//		Returns true if sum of numbers is even
		System.out.println(p.test(10,20));        
		System.out.println(p.test(15, 30));

	}

}
