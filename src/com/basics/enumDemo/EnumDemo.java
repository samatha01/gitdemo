package com.basics.enumDemo;

public class EnumDemo {

	public static void main(String[] args) {
		DaysOfTheWeek day;
		for(DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
			System.out.println(myDay);
		}
			

	}

}
