package com.basics.sortStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.*;
import java.util.*;

//sort employee salaries in desc order using stream
public class EmpDemo {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1,3000));
		empList.add(new Employee(2,5000));
		empList.add(new Employee(3,2000));
		empList.add(new Employee(4,10000));
		System.out.println(empList);
		/*List<Employee> empSortedList=
		empList.stream().sorted((o1,o2) -> (int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		System.out.println(empSortedList);*/
		//to get top two highest salary
		List<Employee> empSortedList=empList.stream().
		sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(2).collect(Collectors.toList());
		System.out.println(empSortedList);
		//salary less than first highest salary
		List<Employee> empSortedList1=empList.stream().
		sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(1).collect(Collectors.toList());
		System.out.println(empSortedList1);
				               
		               
		
		

	}

}
