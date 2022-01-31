package com.basics.demo;

public class SynchronizationDemo {

	public static void main(String[] args) {
		MathUtils obj=new MathUtils();
		Thread3 t3=new Thread3(obj);
		t3.start();
		Thread t=new Thread(new Thread4(obj));
		t.start();
	}

}
