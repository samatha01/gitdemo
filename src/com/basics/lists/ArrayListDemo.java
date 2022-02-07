package com.basics.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List <String> color=new ArrayList <String> ();
		   color.add("Red");
		   color.add("Blue");
		   color.add("Green");
		   color.add("Yellow");
		   System.out.println(color);
		   System.out.println(color.get(0));

     	   System.out.println(color.set(0, "pink"));
		   System.out.println(color.set(2, "purple"));
		   System.out.println(color);
		   System.out.println(color.isEmpty());
		   System.out.println(color.remove(0));
		   System.out.println(color);
		   }

}
