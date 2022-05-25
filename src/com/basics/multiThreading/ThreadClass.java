package com.basics.multiThreading;

public class ThreadClass extends Thread {

	@Override
	public void run() {
	   for(int i=0;i<10000;i++)
	   {
		   
		   System.out.println("I am executed by a child thread" +i);
		   System.out.println("Thread name is "+Thread.currentThread().getName());
		   System.out.println("I am Daemon or not "+Thread.currentThread().isDaemon());
	   }
		
	}


}
