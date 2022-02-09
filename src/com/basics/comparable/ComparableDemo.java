package com.basics.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList <Student> list=new ArrayList<Student>();
          Student john = new Student(3,"John",22);
          Student tom = new Student(1,"Tom",20);
          Student harry = new Student(2,"Harry",21);
          list.add(harry);
          list.add(john);
          list.add(tom);
          Collections.sort(list);
          System.out.println("Students after sorting: ");
          list.forEach(student -> System.out.println(student.getName()));
          
	}

}
