package com.basics.multiThreading;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("welcome");
		ThreadClass threadClass=new ThreadClass();
		//creating daemon thread
		threadClass.setDaemon(true);
		
		threadClass.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("I am executed by a main thread" +i);
		}
		

	}

}
