package com.basics.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		  Student john=new Student(3,"John",21);
		  Student jane=new Student(2,"Jane",25);
		  Student tom=new Student(1,"Tom",22);
		  list.add(john);
		  list.add(tom);
		  list.add(jane);
		  Collections.sort(list,new AgeComparator());         //sorting based on age
		  System.out.println("Students after Age sorting: ");  
		  list.forEach(student -> System.out.println(student.getName()));

	}

}
