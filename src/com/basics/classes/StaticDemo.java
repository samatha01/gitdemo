package com.basics.classes;
class Emp{
	int eid;
	int salary;
	static String ceo;
static
{
	ceo="Harry";
	System.out.println("in static");
}
public Emp() {
	eid=1;
	salary=5000;
	System.out.println("in constructor");
	}
public void show() {
	System.out.println(eid +":" +salary+":"+ceo);
    }
}
public class StaticDemo {

	public static void main(String[] args) {
		Emp john=new Emp();
		Emp rahul=new Emp();
		rahul.eid=2;
		rahul.salary=3000;
		
		john.show();
		rahul.show();
		
	}

}
