package com.tns.nonaccess;

public class MyClass {
	private int section; //instance variable
	private static int srNo; //static variable

	MyClass(){
		System.out.println("Static method");
		srNo++;
		section++;
	}
	
	
	static {
		System.out.println("Static block");
		System.out.println("Static variable");
		
	}
	
	void hello() {
		srNo++;
		section++;
	}
	
	static void display() {
		System.out.println("Static method");
		srNo++; //s
	}
}
