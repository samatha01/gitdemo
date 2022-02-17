package com.basics.function;
import java.util.function.*;
public class Test3 {

	public static void main(String[] args) {
		IntUnaryOperator f1=i->i+1;
		System.out.println(f1.applyAsInt(4));
		IntUnaryOperator f2=i->i*i;
		System.out.println(f2.applyAsInt(4));
		System.out.println(f1.andThen(f2).applyAsInt(5));
		BinaryOperator<String> b=(s1,s2)->s1+s2;
		System.out.println(b.apply("Hello","World"));

	}

}
