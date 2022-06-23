package com.practice.javaPrograms;

public class JavaSingleton {

		public static JavaSingleton obj;
		
		private JavaSingleton() {
			System.out.println("Instance created");
		}
		
		
    public static JavaSingleton getInstance()     //double checked locking
    {
        if(obj==null)
    	{
    		synchronized(JavaSingleton.class)
    		{
    			if(obj==null)
    			{
    				obj=new JavaSingleton();
    			}
    		}
    	}
    return obj;
    	}	
	}

