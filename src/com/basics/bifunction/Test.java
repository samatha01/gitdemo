package com.basics.bifunction;
import java.util.ArrayList;
import java.util.function.*;
class Employee
{
	int eno;
	String ename;
	Employee(int eno,String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}
}
public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		BiFunction<Integer,String,Employee> f=(eno,ename)->new Employee(eno,ename);
		l.add(f.apply(13332, "John"));
		l.add(f.apply(33323, "Tom"));
		l.add(f.apply(23332, "Jane"));
		for(Employee e:l)
		{
			System.out.println("Employee number:"+e.eno);
			System.out.println("Employee name:"+e.ename);
			System.out.println();
		}
	}

}
