package com.basics.exception;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		try{
			int data=100/0;
		
		System.out.println(data);
	}catch(ArithmeticException e) {
		System.out.println("caught Arithmetic Exception:" +e.getMessage());
	}
		finally{
			
		System.out.println("This will always be executed ");
		}
    }
}