package com.basics.demo;

public class Thread4 implements Runnable {
	MathUtils mu;
	public Thread4(MathUtils mu) {
		this.mu=mu;
	}
	@Override
	public void run() {
		try {
			mu.getMultiples(3);
		}catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
