package com.tnsif.collection.comparator;

public class Student {
	int rollNO;
	String name,address;
	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", name=" + name + ", address=" + address + "]";
	}
	public Student(int rollNO, String name, String address) {
		super();
		this.rollNO = rollNO;
		this.name = name;
		this.address = address;
	}

}
