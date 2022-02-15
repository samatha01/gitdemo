package com.basics.functional;
import java.util.function.*;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Ravi",2000));
		l.add(new Employee("Shiva",3000));
		l.add(new Employee("Adarsh",4000));
		l.add(new Employee("Tom",5000));
//		to get employees whose salary>3000
		Predicate<Employee> p=e->e.salary>3000;
		for(Employee e1:l)
		{
			if(p.test(e1))
			{
				System.out.println(e1.name+":"+e1.salary);
			}
		}

	}

}
