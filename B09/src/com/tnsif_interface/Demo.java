package com.tnsif_interface;

public class Demo {
	
	public static void main(String[] args) {
		payment Creditcard=new Creditcard("123456789");
		Creditcard.process(200);
		
		payment UPI=new UPI("123456789@ybl");
		UPI.process(200);
		
		payment Debitcard=new Debitcard("12345");
		Debitcard.process(500);
		
		
	}

}
