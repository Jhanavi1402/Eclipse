package com.tnsif.exception.handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExample {

	public static void main(String[] args) {
		FileReader file = new FileReader("data.txt");
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println(fileInput.readLine());
		fileInput.close();
		// TODO Auto-generated method stub

	}

}
