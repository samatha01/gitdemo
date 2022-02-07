package com.basics.lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List <Integer> list=new LinkedList <Integer> ();
		   list.add(10);
		   list.add(20);
		   list.add(30);
		   list.add(40);
		   list.add(50);
		   System.out.println(list.size());
		   for(Integer element:list) {
			   System.out.println("for each element is "+element);
		   }
		List <Integer> newList =new LinkedList <Integer> ();
		    newList.add(60);
		    newList.add(70);
		    newList.add(80);
		    list.addAll(newList);
		    System.out.println(list);
		    System.out.println(list.contains(80));
		    list.remove(Integer.valueOf(80));
		    Iterator <Integer> it=list.iterator();
		    while(it.hasNext()) {
		    	System.out.println("iterator " +it.next());
		    }
		    list.clear();
		    System.out.println(list);
		    System.out.println(list.isEmpty());
		    list.add(40);
		    list.add(400);
		    list.add(4000);
		    System.out.println(list);
		    list.set(0, 100);
		    list.set(1, 200);
		    System.out.println(list);
		    System.out.println(list.contains(200));
	}

}
