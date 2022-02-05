package com.basics.exception;

import java.util.ArrayList;
import java.util.List;

public class WriterHelper {
public void writeList() {
	try {
		List <Integer> list=new ArrayList <> (5);
		list.add(20);
		list.add(30);
		Integer a=list.get(3);
		System.out.println("Accessing the fourth element: " +a);
	}catch(IndexOutOfBoundsException e) {
		System.out.println("Caught Index Out Of Bounds Exception:" +e.getMessage());
	}
	finally {
		System.out.println("This will always be executed");
	}
}
}
