package com.basics.functional;

public class MultiThreadDemo {

	public static void main(String[] args) {
		
		Runnable r=()->{                      //using lambda expression implementing Runnable interface for multi threading
			for(int i=0;i<10;i++)
			{
				System.out.println("Child thread1");
			}
		};
     Thread t=new Thread(r);
     t.start();
     for(int i=0;i<10;i++)
     {
    	 System.out.println("Main thread 1");
     }
	}

}
