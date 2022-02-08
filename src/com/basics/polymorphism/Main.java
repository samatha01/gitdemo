package com.basics.polymorphism;

public class Main {
	public int sum(int x,int y)
	{
		return (x+y);
	}
	public int sum(int x,int y,int z)       //method overloading
	{
		return(x+y+z);
		
	}
	public double sum(double x,double y)
	{
		return(x+y);
		}

	public static void main(String[] args) {
		
       Main m1=new Main();
       System.out.println(m1.sum(10,20));
       System.out.println(m1.sum(10,20,30));
       System.out.println(m1.sum(10.5,20.5));
	}

}
