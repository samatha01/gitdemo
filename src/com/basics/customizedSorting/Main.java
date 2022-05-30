package com.basics.customizedSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee e1=new Employee(1,20,"Tom",new Address("Street1",456));
		Employee e2=new Employee(2,30,"Jerry",new Address("Street2",344));
		Employee e3=new Employee(3,21,"Bunny",new Address("Street3",120));
		Employee e4=new Employee(4,50,"Harry",new Address("Street4",200));
		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		System.out.println("unsorted List" +empList);
		System.out.println("************************************");
		//Age sorting
		Collections.sort(empList, new AgeComparator());
		System.out.println("sorted based on ages:" +empList);
		System.out.println("************************************");
		//Names sorting
		Collections.sort(empList, new NameComparator());
		System.out.println("sorted based on names:" +empList);
		System.out.println("************************************");
		//address sorting based on pincode
		Collections.sort(empList,new AddressComparator());
		System.out.println("sorted on based of Address pincode:" +empList);
		
		
		
	}

}
