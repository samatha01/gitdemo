package com.basics.Interfaces;

public class Iphone implements Phone{
	public void cost() {
		System.out.println("Cost of Iphone is 800$");     //defining methods of interface Phone.
			}
	public void color() {
		System.out.println("Color of Iphone is blue");
	}
	public void batteryLife() {
		System.out.println("Battery life of Iphone is 22 hours");
	}

	public static void main(String[] args) {
		Phone p=new Iphone();
		p.color();
		p.cost();
		p.batteryLife();

	}

}
