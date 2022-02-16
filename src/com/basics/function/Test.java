package com.basics.function;
import java.util.function.*;
public class Test {

	public static void main(String[] args) {
	Function<Integer,Integer> f1=i->2*i;
	Function<Integer,Integer> f2=i->i*i*i;
	 System.out.println(f1.apply(2));
	 
//	System.out.println(f1.andThen(f2).apply(2));
    System.out.println(f1.compose(f2).apply(2));
   
    Consumer <String> c=s->System.out.println(s);
    c.accept("Larry");
	}

}
