package com.practice.javaPrograms;

public class SingletonDemo {

	public static void main(String[] args) throws Exception {
		
        Thread t1=new Thread(new Runnable(){
        	           public void run()
        	           {
        	        	   JavaSingleton obj=JavaSingleton.getInstance();
        	           }
        });
        Thread t2=new Thread(new Runnable(){
        	            public void run()
        	            {
        	            	JavaSingleton obj=JavaSingleton.getInstance();
        	            }
        	
        });
        t1.start();
        t2.start();
	}

}
