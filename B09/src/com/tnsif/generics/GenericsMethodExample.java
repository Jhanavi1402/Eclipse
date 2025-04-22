package com.tnsif.generics;

public class GenericsMethodExample {
	
	public static <T> void printArray(T[] elements) {
		for(T element : elements) {
		System.out.println(element + "");
		}
	System.out.println();
}
//static belongs to class and does not require object to be called or created

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		String[] strArray = {"Hello"};
		System.out.println("Integer Array: ");
		printArray(intArray);
		System.out.print("String Array: ");
		printArray(strArray);
		
		
	}
}
