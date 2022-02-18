package com.basics.constructorReference;
class Sample
{
	Sample(){
		System.out.println("Sample class constructor execution");
	}
}
interface A
{
	public Sample get();
}
public class Test {

	public static void main(String[] args) {
//		constructor reference
		A i=Sample::new;
	    Sample s1=i.get();
	    Sample s2=i.get();
	
	}

}
