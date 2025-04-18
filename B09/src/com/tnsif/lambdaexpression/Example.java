package com.tnsif.lambdaexpression;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting greet=(a, b)->{return(a+b);};
		int add = greet.greet(5, 3);
		System.out.println(add);
		
	}
}
