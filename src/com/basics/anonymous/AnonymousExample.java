package com.basics.anonymous;
class A{
	public void show() {
		System.out.println("Welcome");
	}
}
public class AnonymousExample {
	
	public static void main(String[] args) {
		
         A obj=new A()                     //anonymous class defined
		       {
	             public void show() {
		          System.out.println("Hello World");
	              }
		        };
    obj.show();
    }
}
