package com.basics.function;
import java.util.function.*;
public class Main {

	public static void main(String[] args) {
		Function<Student,String> f=s->{
			int marks=s.marks;
			String grade=" ";
			if(marks>=80) grade="A[Distinction]";
			else if(marks>=60) grade="B[First class]";
			else if(marks>=50) grade="C[Third class]";
			else grade="E[Failed]";
			return grade;
		};
//		To get the students whose marks>=60
		Predicate<Student> p=s->s.marks>=60;
		Consumer<Student> c=s1->
		{
			System.out.println("Student Name:"+s1.name);
			System.out.println("Student marks:"+s1.marks);
			System.out.println("Student grade:"+f.apply(s1));
			System.out.println();
		};
    Student[] s= {new Student("Tom",100),new Student("Harry",65),new Student("Larry",55),new Student("John",45),new Student("Jane",25)};
      for(Student s1:s)
    	  if(p.test(s1))
    	  {
    		  c.accept(s1);
    	  }
	}

}
