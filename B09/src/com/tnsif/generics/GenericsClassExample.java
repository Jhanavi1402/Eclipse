package com.tnsif.generics;

class Box<T>{
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
public class GenericsClassExample {

	public static void main(String[] args) {
		// Creating a object for box classs (Integer)
		Box<Integer> intBox=new Box<>();
		intBox.setValue(100);
		System.out.println("Integer value" + intBox.getValue());
		
		// Creating a object for box classs (String)
				Box<String> strBox=new Box<>();
				strBox.setValue("Hello Generics!");
				System.out.println("Integer value" + strBox.getValue());
	}

}
