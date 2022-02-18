package com.basics.methodReference;
interface Interf
{
	public void add(int a,int b);
}

public class Test {
	public static void sum(int x,int y)
	{
		System.out.println("The sum:"+(x+y));
	}
	public static void main(String[] args) {
//		interface add method is referring sum method of class Test
		Interf i=Test::sum;          
		i.add(100,200);
	}

}
