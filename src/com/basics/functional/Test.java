package com.basics.functional;

public class Test {
	
	public static void main(String[] args) {
				
			Interf i=n->n*n;            //using lambda expression to define square method.
			System.out.println("The square of 5 is " +i.square(5));
			System.out.println("The square of 6 is "+i.square(6));
		}
	}

