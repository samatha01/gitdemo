package com.basics.demo;

import java.util.Stack;

public class StacksDemo {
	public static void main(String[] args) {
Stack<String> stack=new Stack <> ();
stack.push("India");
stack.push("America");
stack.push("Cuba");
stack.push("France");
System.out.println("Stack: "+stack);
String poppedElement=stack.pop();
System.out.println("Popped element:" +poppedElement);
System.out.println("Now the stack looks like: "+stack);
System.out.println("Next element to be popped is "+stack.peek());



	
		
	}

}
