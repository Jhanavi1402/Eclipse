package com.tnsif.exception.handling;

public class TryCatchFinallyException {

	public static void main(String[] args) {
		// Syntax 
		try {
				
			//code that may throw an exception
			int result = 10/0;
		}catch(Exception e) {
			// code that handle exception
			System.out.println("Caught an exception!!" +e);
		}finally {
			// This block always executes
			System.out.println("this is the finally block");
			
		}

	}

}
