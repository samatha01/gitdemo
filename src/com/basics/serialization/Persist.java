package com.basics.serialization;
import java.io.*;
public class Persist {

	public static void main(String[] args) {
		try {
			//creating objects of Employee class
			Employee emp1=new Employee(21222,"John");
			Employee emp2=new Employee(21226,"Tom");
			Employee emp3=new Employee(21227,"Jane");
		FileOutputStream fout=new FileOutputStream("output.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp1);   
		out.writeObject(emp2);
		out.writeObject(emp3);
        out.flush();
		out.close();
		System.out.println("Serialization & Deserialization successfully executed");
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
