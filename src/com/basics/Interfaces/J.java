package com.basics.Interfaces;

public interface J {
void write();                         //declaring abstract method
default void show() {                             //defining default method in interface
	System.out.println("C is full of pearls");
}
}
