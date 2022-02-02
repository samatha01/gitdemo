package com.basics.Interfaces;

public class Main1 implements J {
	public void write() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		J obj=new Main1();
		obj.write();
		obj.show();

	}

}
