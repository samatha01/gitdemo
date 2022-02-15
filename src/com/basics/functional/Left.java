package com.basics.functional;

public interface Left {
     default void m1()
     {
    	 System.out.println("Left Interface m1 method");
     }
}
interface Right{
	default void m1()
	{
		System.out.println("Right Interface m1 method");
	}
}