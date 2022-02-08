package com.basics.inheritance;

import java.util.Scanner;

public class GrandChild extends Child {
      String gender=" ";
      public GrandChild(String n,int a,String g) {
    	  super(n,a);
    	  gender=g;
      }
      public void showGender() {
    	  System.out.println("gender is "+gender);
      }
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String Pname=sc.next();
	System.out.println("Enter your age");
	int Page=sc.nextInt();
	System.out.println("Enter your gender");
	String Pgender=sc.next();
	GrandChild gc=new GrandChild(Pname,Page,Pgender);
	gc.showName();           //Parent class method
	gc.showAge();           //Child class method
	gc.showGender();        //GrandChild class method
	sc.close();
}
}
