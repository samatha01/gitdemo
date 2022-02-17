package com.basics.bifunction;
import java.util.ArrayList;
import java.util.function.*;
class Emp
{
	String name;
	Double salary;
	Emp(String name,Double salary)
	{
	this.name=name;
	this.salary=salary;
	}
	
}
public class Main {

	public static void main(String[] args) {
		ArrayList<Emp> l=new ArrayList<Emp>();
		populate(l);
		BiConsumer<Emp,Double> c=(e,d)->e.salary=e.salary+d;
//		incrementing salary by 500.
		for(Emp e:l)
		{
			c.accept(e, 500.0);
		}
		for(Emp e:l)
		{
			System.out.println("Employee name:"+e.name);
			System.out.println("Employee salary:"+e.salary);
			System.out.println();
		}
	}
	public static void populate(ArrayList<Emp> l)
	{
		l.add(new Emp("Sunny",1000.0));
		l.add(new Emp("Bunny",2000.0));
		l.add(new Emp("Vinny",3000.0));
		
	}
    
}
