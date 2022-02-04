package com.basics.classes;

class Outer{
	int a;
	public void show() {
		System.out.println("Hello from outer class");
		}
	class Inner{
		public void display() {
			System.out.println("Hello from Inner class");
		}
	}
}
public class InnerDemo {

	public static void main(String[] args) {
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=obj.new Inner();      //object of Inner class
		obj1.display();

	}

}
