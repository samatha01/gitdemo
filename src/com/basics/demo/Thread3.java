package com.basics.demo;

public class Thread3 extends Thread {
MathUtils mu;
public Thread3(MathUtils mu) {
	this.mu=mu;
}
@Override
public void run() {
	try {
		mu.getMultiples(2);
	}catch(Exception e) {
		System.out.println("Exception is caught");
	}
}
}
