package com.tnsif.Interface;

public class Creditcard implements payment{
	private String cardNo;

	public Creditcard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "Creditcard [cardNo=" + cardNo + "]";
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing credit card payemt is Rs. "+amt+" using credit card No.: "+cardNo);
		
	}

	
	
	

}
