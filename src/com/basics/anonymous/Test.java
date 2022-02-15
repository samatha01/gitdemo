package com.basics.anonymous;

public class Test {

	public static void main(String[] args) {
     	            
        //	implementing thread concept by using anonymous inner class
		Runnable r=new Runnable()  {	
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("Child thread");
				}
			}
		};
       Thread t=new Thread(r);
          t.start();
          for(int i=0;i<10;i++)
           {
    	  System.out.println("Main thread");
           }
	}
}
