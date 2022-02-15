package com.basics.functional;

public class Test2 implements Left,Right
{
	public void m1()      //defining m1 method                     
	{
		System.out.println("Our own m1 method");
//		Right.super.m1();              calling Right interface m1 method
		Left.super.m1();              //calling Left interface m1 method
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m1();

	}

}
