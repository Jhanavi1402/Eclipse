package com.tnsif_interface;

public class Debitcard implements payment{
	private String cardNo;

	public Debitcard(String cardNo) {
		super();
		this.cardNo = cardNo;
	}

	@Override
	public void process(double amt) {
		System.out.println("Processing debit card payment of Rs. "+amt+"  using Debit card No.: "+cardNo);
		// TODO Auto-generated method stub
		
	}
	

}
