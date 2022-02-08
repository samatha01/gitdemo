package com.basics.inheritance;

public class Child extends Parent {
  int age=0;
  public Child(String n,int a)  {  //child class constructor

	  super(n);
	  age=a;
	  }
  public void showAge() {
	  System.out.println("Age is "+age);
  }
}
