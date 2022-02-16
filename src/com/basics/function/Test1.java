package com.basics.function;
import java.util.Date;
import java.util.function.*;
public class Test1 {

	public static void main(String[] args) {
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());           //To get system date.

	}

}
