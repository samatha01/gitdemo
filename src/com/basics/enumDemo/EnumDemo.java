package com.basics.enumDemo;

public class EnumDemo {

	public static void main(String[] args) {
		DaysOfTheWeek day=DaysOfTheWeek.FRIDAY;
		if(day==DaysOfTheWeek.FRIDAY) {
			System.out.println("Its almost Saturday");
		}
		for(DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
			System.out.println(myDay);
		}
			

	}

}
