package com.tnsif.example.questions;

import java.util.Scanner;

public class StringSlicing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//take the String input
		System.out.println("Enter the string:");
		String text = scanner.nextLine();
		
		System.out.println("Enter the start index:");
		int start = scanner.nextInt();
		
		System.out.println("Enter the end index:");
		int end = scanner.nextInt();
		
		//validate and slice the string
		if (start >=0 && end <= text.length() && start < end) {
			String slice = text.substring(start, end);
			System.out.println("Sliced  string:" + slice);
		}
		else {
			System.out.println("invalid index!");
		}
		
		scanner.close();
	}

}
